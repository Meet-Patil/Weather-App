// Works when your frontend files are inside:
// src/main/resources/static
const API_URL = "/weather/my";

const form = document.getElementById("weather-form");
const button = document.getElementById("search-button");
const statusText = document.getElementById("status");
const results = document.getElementById("results");
const forecast = document.getElementById("forecast");

function temperature(value) {
    return typeof value === "number" && Number.isFinite(value)
        ? `${value.toFixed(1)}°C`
        : "—";
}

function weatherIcon(condition) {
    const text = String(condition).toLowerCase();

    if (/thunder|storm/.test(text)) return "⛈️";
    if (/snow|sleet|ice/.test(text)) return "❄️";
    if (/rain|drizzle/.test(text)) return "🌧️";
    if (/cloud|overcast/.test(text)) return "☁️";
    if (/mist|fog/.test(text)) return "🌫️";
    if (/sun|clear/.test(text)) return "☀️";

    return "🌡️";
}

function addText(parent, tag, className, value) {
    const element = document.createElement(tag);

    element.className = className;
    element.textContent = value;
    parent.appendChild(element);

    return element;
}

function renderWeather(data) {
    // These field names match your backend response.
    const weather = data.weatherResponce;

    document.getElementById("city-name").textContent =
        weather.city || "Unknown city";

    document.getElementById("location").textContent = [
        weather.reign,
        weather.country
    ].filter(Boolean).join(", ");

    document.getElementById("condition").textContent =
        weather.condition || "Condition unavailable";

    document.getElementById("weather-icon").textContent =
        weatherIcon(weather.condition);

    document.getElementById("temperature").textContent =
        temperature(weather.temperature);

    document.getElementById("forecast-count").textContent =
        `${data.days.length} day${data.days.length === 1 ? "" : "s"} returned`;

    forecast.replaceChildren();

    data.days.forEach(day => {
        const card = document.createElement("article");
        card.className = "day-card";

        const date = new Date(`${day.date}T12:00:00`);
        const validDate = !Number.isNaN(date.getTime());

        addText(
            card,
            "h3",
            "",
            validDate
                ? date.toLocaleDateString("en-US", { weekday: "long" })
                : "Forecast"
        );

        addText(
            card,
            "p",
            "date",
            validDate
                ? date.toLocaleDateString("en-US", {
                    month: "short",
                    day: "numeric",
                    year: "numeric"
                })
                : String(day.date || "Date unavailable")
        );

        addText(card, "p", "average", temperature(day.avgtemp));
        addText(card, "p", "average-label", "Average temperature");

        const range = document.createElement("div");
        range.className = "range";

        addText(range, "span", "", `↓ Low ${temperature(day.mintemp)}`);
        addText(range, "span", "", `↑ High ${temperature(day.maxtemp)}`);

        card.appendChild(range);
        forecast.appendChild(card);
    });

    if (!data.days.length) {
        addText(forecast, "p", "", "No forecast days were returned.");
    }

    results.hidden = false;
}

async function getWeather(event) {
    event.preventDefault();

    const city = document.getElementById("city").value.trim();
    const days = document.getElementById("days").value;

    if (!city) {
        statusText.textContent = "Please enter a city name.";
        statusText.className = "error";
        document.getElementById("city").focus();
        return;
    }

    button.disabled = true;
    button.textContent = "Loading…";
    statusText.className = "";
    statusText.textContent = `Getting weather for ${city}…`;
    results.hidden = true;

    const controller = new AbortController();
    const timeout = setTimeout(() => controller.abort(), 15000);

    try {
        const url = new URL(API_URL, window.location.href);

        url.searchParams.set("city", city);
        url.searchParams.set("days", days);

        const response = await fetch(url, {
            headers: {
                Accept: "application/json"
            },
            signal: controller.signal
        });

        if (!response.ok) {
            if (response.status === 401 || response.status === 403) {
                throw new Error(
                    `Access denied (${response.status}). Your backend requires authentication or permission.`
                );
            }

            throw new Error(
                `Weather request failed (HTTP ${response.status}). Check the city and try again.`
            );
        }

        const data = await response.json();

        if (
            !data ||
            !data.weatherResponce ||
            !Array.isArray(data.days) ||
            data.days.some(day => !day || typeof day !== "object")
        ) {
            throw new Error(
                "Unexpected response: expected weatherResponce and a days array."
            );
        }

        renderWeather(data);
        statusText.textContent = "Weather updated successfully.";
    } catch (error) {
        statusText.className = "error";

        if (error.name === "AbortError") {
            statusText.textContent =
                "The request took too long. Please try again.";
        } else if (error instanceof TypeError) {
            statusText.textContent =
                "Cannot reach the weather API. Check that Spring Boot is running and the API URL and CORS settings are correct.";
        } else {
            statusText.textContent = error.message;
        }
    } finally {
        clearTimeout(timeout);
        button.disabled = false;
        button.textContent = "Get weather →";
    }
}

form.addEventListener("submit", getWeather);