package headfirst.designpatterns.combining.test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lh
 */
public class Flock  implements Quackable{
    Observable observable;

    private ArrayList ducks = new ArrayList();

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        ducks.add(quacker);
    }
    @Override
    public void quack() {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }

    }
}
