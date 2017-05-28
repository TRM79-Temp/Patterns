/**
 * Created by Roman on 28.05.2017.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private  Subject weatherData;

    public  ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: Improving weather on the way!");
    }
}
