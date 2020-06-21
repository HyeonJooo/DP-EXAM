
public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);
		Alarm alarm = new Alarm();
		Command alarmStartCommand = new AlarmStartCommand(alarm);
		
		Button btn1 = new Button(lampOnCommand);
		btn1.pressed();
		
		Button btn2 = new Button(alarmStartCommand);
		btn2.pressed();
		
		btn2.setCommand(lampOnCommand);
		btn2.pressed();
	}

}
