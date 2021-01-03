package headfirst.designpatterns.test.chap1;

/**
 * @author : lh
 * @since : 2021/1/3, Sun
 **/
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
