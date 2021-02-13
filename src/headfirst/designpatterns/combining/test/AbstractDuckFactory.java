package headfirst.designpatterns.combining.test;

import headfirst.designpatterns.strategy.Quack;

/**
 * @author lh
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();

    public Quackable createGooseDuck() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }
}
