package headfirst.designpatterns.observer.test;

/**
 * @author : lh
 * @since : 2021/1/3, Sun
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private final Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + " % humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }
}
