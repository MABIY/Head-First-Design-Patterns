package headfirst.designpatterns.combining.test3;

/**
 * @author lh
 */
public interface ControllerInterface {
    void start();

    void stop();

    void increaseBPM();

    void decreaseBPM();

    void setBPM(int bpm);
}
