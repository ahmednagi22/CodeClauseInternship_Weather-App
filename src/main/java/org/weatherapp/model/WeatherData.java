package org.weatherapp.model;

public class WeatherData {
    private String city;
    private String country;
    private double temperature;
    private int humidity;
    private String weatherDescription;
    private double windSpeed;

    public WeatherData(String city, double windSpeed, String weatherDescription, int humidity, double temperature, String country) {
        this.city = city;
        this.windSpeed = windSpeed;
        this.weatherDescription = weatherDescription;
        this.humidity = humidity;
        this.temperature = temperature;
        this.country = country;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", weatherDescription='" + weatherDescription + '\'' +
                ", windSpeed=" + windSpeed +
                '}';
    }
}
