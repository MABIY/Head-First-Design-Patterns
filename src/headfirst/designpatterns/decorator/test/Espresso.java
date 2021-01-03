package headfirst.designpatterns.decorator.test;

/**
 * @author : lh
 * @since : 2021/1/3, Sun
 **/
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
