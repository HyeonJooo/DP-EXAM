public class User {
	private int name;
	public User(int name) {
		this.name = name;
	 }
	public void print() {
		Printer printer = Printer.getInstance();
		printer.print(this.name + " print using " + printer.toString());
	}
}