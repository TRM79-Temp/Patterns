package headfirst.observer.weather;

/**
 * Created by Roman on 28.05.2017.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private  Subject weatherData;

    public  StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = 80.0/80.0/80.0");
    }
}
