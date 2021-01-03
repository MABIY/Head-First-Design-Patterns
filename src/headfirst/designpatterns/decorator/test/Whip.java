package headfirst.designpatterns.decorator.test;


public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
		description = ", Whip";
	}
 
	public String getDescription() {
		return beverage.getDescription() + description;
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
