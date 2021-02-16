package headfirst.designpatterns.combining.test3;

/**
 * @author lh
 */
public class HeartController implements ControllerInterface {
    HeartModelInterface model;
    DJView view;
    public HeartController(HeartModel heartModel) {
        this.model = heartModel;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }

    @Override
    public void setBPM(int bpm) {

    }
}
