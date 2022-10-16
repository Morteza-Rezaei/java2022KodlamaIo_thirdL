package polymorphismDemo;

public class ConsoleLogger extends BaseLoger {
	public void log(String message) {
		System.out.println("Logged to console : " + message);
	}

}
