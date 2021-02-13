package headfirst.designpatterns.combining.test;

import static java.lang.System.lineSeparator;

/**
 * @author lh
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingQuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println(lineSeparator() + "Duck Simulator: with Composite - Flocks");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallard = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        flockOfMallard.add(mallardOne);
        flockOfMallard.add(mallardTwo);
        flockOfMallard.add(mallardThree);
        flockOfMallard.add(mallardFour);

        flockOfDucks.add(flockOfMallard);

        System.out.println(lineSeparator() +"Duck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println(lineSeparator() + "Duck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallard);

        System.out.println(lineSeparator() + "The ducks quacked " + QuackCounter.getQuacks() + "times");
        
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}

