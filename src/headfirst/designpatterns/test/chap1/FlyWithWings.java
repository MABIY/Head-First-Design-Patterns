package headfirst.designpatterns.test.chap1;

/**
 * @author : lh
 * @since : 2021/1/3, Sun
 **/
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
