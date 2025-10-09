package Observer;

public class Client {

    public static void main(String[] args) {
        // Subject
        WeatherData weatherData = new WeatherData();

        // Observers
        Observer c = new CurrentConditionsDisplay();
        Observer f = new ForecastDisplay();

        weatherData.registerObserver(c);
        weatherData.registerObserver(f);

        weatherData.setMeasurements(80,54,34);
        System.out.println();

        weatherData.setMeasurements(70,54,34);
        System.out.println();

        weatherData.setMeasurements(70,44,34);
        System.out.println();

        weatherData.removeObserver(c);

        weatherData.setMeasurements(79,44,34);
        System.out.println();
    }
}
