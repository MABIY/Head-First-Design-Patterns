package headfirst.designpatterns.combining.test3;

/**
 * @author lh
 */
public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
