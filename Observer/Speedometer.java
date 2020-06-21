package PROBLEM1;
import java.util.Observer;
import java.util.Observable;

public class Speedometer extends Observable { //observable�� add, delete, notify, setchange ���
	int currentSpeed;  // initially 0
	
	public Speedometer() {
		currentSpeed=0;
	}

	public void setCurrentSpeed(int speed) {
		currentSpeed = speed;
		setChanged();
		notifyObservers(); //update�� �� �޼ҵ忡�� ����
			// set the speed value and notify to observers
}
	public int getCurrentSpeed() {
		return currentSpeed;
	// return speed
}
}