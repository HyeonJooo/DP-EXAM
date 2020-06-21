package PROBLEM1;
import java.util.Observer;
import java.util.Observable;

public class Speedometer extends Observable { //observable의 add, delete, notify, setchange 상속
	int currentSpeed;  // initially 0
	
	public Speedometer() {
		currentSpeed=0;
	}

	public void setCurrentSpeed(int speed) {
		currentSpeed = speed;
		setChanged();
		notifyObservers(); //update가 이 메소드에서 수행
			// set the speed value and notify to observers
}
	public int getCurrentSpeed() {
		return currentSpeed;
	// return speed
}
}