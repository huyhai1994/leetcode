package observer_pattern;

public class WeatherData {
    CurrentConditionsDisplay currentConditionDisplay;
    StatisticsDisplay statisticDisplay;
    ForecastDisplay forecastDisplay;

    public float getTemperature() {
        return 0F;
    }

    public float getHumidity() {
        return 0F;
    }

    public float getPressure() {
        return 0F;
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        statisticDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);

    }

    // other WeatherData methods here
}
