package polymorphismDemo;

public class DatabaseLogger extends BaseLoger {
	public void log(String message) {
		System.out.println("Logged to database : " + message);
	}
}
