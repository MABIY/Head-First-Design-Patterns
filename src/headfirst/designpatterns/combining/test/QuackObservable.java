package headfirst.designpatterns.combining.test;

/**
 * @author lh
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}
