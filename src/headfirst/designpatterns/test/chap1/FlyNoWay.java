package headfirst.designpatterns.test.chap1;

/**
 * @author : lh
 * @since : 2021/1/3, Sun
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
