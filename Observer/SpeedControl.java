package PROBLEM1;
import java.util.Observer;
import java.util.Observable;

public class SpeedControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a monitor...
		 SpeedMonitor monitor = new SpeedMonitor();
		 // Create a speedometer and register the monitor to it...
		 Speedometer speedo = new Speedometer();
		 speedo.addObserver(monitor);
		 // Drive at different speeds...
		 speedo.setCurrentSpeed(10);
		 speedo.setCurrentSpeed(20);
		 speedo.setCurrentSpeed(50);
		 speedo.setCurrentSpeed(100);
		 speedo.setCurrentSpeed(69);


	}

}
