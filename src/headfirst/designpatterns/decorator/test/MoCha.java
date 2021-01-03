package headfirst.designpatterns.decorator.test;

/**
 * @author : lh
 * @since : 2021/1/3, Sun
 **/
public class MoCha extends CondimentDecorator{

    public MoCha(Beverage beverage) {
        this.beverage = beverage;
        description = ", Mocha";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + description;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
