package headfirst.designpatterns.combining.test;/**
 * @author lh
 */
public class DuckCall implements Quackable {
    Observable observable;
    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
