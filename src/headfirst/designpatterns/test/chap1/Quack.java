package headfirst.designpatterns.test.chap1;
/**
 * @author : lh
 * @since : 2021/1/3, Sun
**/public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
