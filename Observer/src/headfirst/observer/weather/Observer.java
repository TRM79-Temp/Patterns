package headfirst.observer.weather;

/**
 * Created by Roman on 26.05.2017.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
