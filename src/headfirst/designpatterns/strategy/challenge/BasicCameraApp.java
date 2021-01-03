package headfirst.designpatterns.strategy.challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicCameraApp extends PhoneCameraApp {
	public void edit() {
		System.out.println("Basic editing features");
	}

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("12");
		Iterator<String> iterator = a.iterator();
		if (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
