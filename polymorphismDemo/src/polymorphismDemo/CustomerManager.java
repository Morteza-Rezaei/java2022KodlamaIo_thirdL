package polymorphismDemo;

public class CustomerManager {
	private BaseLoger logger;

	public CustomerManager(BaseLoger logger) {
		this.logger = logger;
	}

	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("log mesajı");
	}
}
