# Weather App

A simple console-based weather application that retrieves and displays weather information for a given location using OpenWeatherMap API.

## Features
- Fetch current weather data by city name
- Displays temperature, humidity, weather description, and wind speed
- Error handling for invalid cities

## Technologies Used
- Java
- OpenWeatherMap API
- Gson (for JSON parsing)

## Installation & Setup

### Prerequisites
- Java 17 or later
- Maven
- OpenWeatherMap API Key (Get it from [here](https://home.openweathermap.org/api_keys))

### Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/weather-app.git
   cd weather-app
   ```
2. Add your OpenWeatherMap API key in `HttpClientUtil.java`:
   ```java
   private static final String API_KEY = "your_api_key";
   ```
3. Build and run the application:
   ```sh
   mvn clean install
   java -jar target/weather-app.jar
   ```

## Usage
1. Run the application.
2. Enter the city name.
4. View the weather details.

## Project Structure
- `Main.java` - Entry point of the application; handles user input.
- `WeatherService.java` - Fetches and processes weather data from the API and assign it to WeatherData class.
- `HttpClientUtil.java` - Handles HTTP requests to the OpenWeatherMap API.
- `WeatherData.java` - Data model class representing weather details.
  
## Example Output
```
Enter city: Cairo
City: Cairo, EG
Temperature: 18.42°C
Humidity: 63%
Weather: Clear Sky
Wind Speed: 5.14m/s
```

