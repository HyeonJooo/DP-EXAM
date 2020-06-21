package PROBLEM1;
import java.util.Observer;
import java.util.Observable;

public class SpeedMonitor implements Observer {
	public static final int SPEED_TO_ALERT = 70;
	Observable observable;

	public void update(Observable obs, Object obj) {//observer의 업데이트 메소드 여기서 구체화
		if(obs instanceof Speedometer) {
			Speedometer speedo = (Speedometer)obs;
			if (speedo.currentSpeed > SPEED_TO_ALERT) {
				System.out.println("** ALERT ** Driving too fast! (" + speedo.getCurrentSpeed() + ")");
			}
			else {
				System.out.println("... nice and steady ... (" + speedo.getCurrentSpeed() + ")");
			}
		}
	}
}