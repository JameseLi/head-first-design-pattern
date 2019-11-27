package observerpattern.weatherdata;

/**
 * @author lizhengjun
 */
public class WeatherDataMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4F);
        weatherData.setMeasurements(82,70,29.2F);
        weatherData.setMeasurements(78,90,29.2F);
    }
}
