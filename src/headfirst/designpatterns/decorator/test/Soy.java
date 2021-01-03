package headfirst.designpatterns.decorator.test;


public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
		description = ", Soy";
	}

	public String getDescription() {
		return beverage.getDescription() + description;
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
