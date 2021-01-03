package headfirst.designpatterns.decorator.test;

/**
 * @author : lh
 * @since : 2021/1/3, Sun
 **/
public abstract class Beverage {
   String description = "Unknown Beverage";


   public String getDescription() {
      return description;
   }

   public abstract double cost();
}
