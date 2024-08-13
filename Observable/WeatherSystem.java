package Observable;

public class WeatherSystem {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        TemperatureDisplay temp = new TemperatureDisplay();
        HumidityDisplay humidity = new HumidityDisplay();

        weatherData.registerObserver(temp);
        weatherData.registerObserver(humidity);

        weatherData.setMeasurements(10.1f, 2.0f, 122.1f);

        String weather = weatherData.toString();
        System.out.println(weather);
    }
}
