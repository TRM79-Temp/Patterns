package headfirst.observer.weather;

/**
 * Created by Roman on 26.05.2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
