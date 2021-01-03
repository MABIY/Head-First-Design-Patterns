package headfirst.designpatterns.decorator.test;

/**
 * @author : lh
 * @since : 2021/1/3, Sun
 **/
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
