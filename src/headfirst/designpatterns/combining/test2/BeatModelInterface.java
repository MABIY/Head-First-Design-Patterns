package headfirst.designpatterns.combining.test2;

import headfirst.designpatterns.combined.djview.BPMObserver;
import headfirst.designpatterns.combined.djview.BeatObserver;

/**
 * @author lh
 */
public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
