package headfirst.designpatterns.combining.test3;


/**
 * @author lh
 */
public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
