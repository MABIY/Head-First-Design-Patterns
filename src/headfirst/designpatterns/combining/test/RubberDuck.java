package headfirst.designpatterns.combining.test;

/**
 * @author lh
 */
public class RubberDuck implements Quackable {
    Observable observable;
    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();

    }
}
