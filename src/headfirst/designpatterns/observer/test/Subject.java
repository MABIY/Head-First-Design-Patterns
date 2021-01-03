package headfirst.designpatterns.observer.test;

/**
 * @author : lh
 * @since : 2021/1/3, Sun
 **/
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
