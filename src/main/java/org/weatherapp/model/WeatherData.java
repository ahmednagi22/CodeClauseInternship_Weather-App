package org.weatherapp.model;

public class WeatherData {
    private String city;
    private String country;
    private double temperature;
    private int humidity;
    private String weatherDescription;
    private double windSpeed;

    public WeatherData() {

    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "WeatherData\n" +
                "city='" + city + '\'' +
                "\ncountry='" + country + '\'' +
                "\ntemperature=" + temperature +"°C"+
                "\nhumidity=" + humidity +
                "\nweatherDescription='" + weatherDescription + '\'' +
                "\nwindSpeed=" + windSpeed + "m/s";
    }
}
