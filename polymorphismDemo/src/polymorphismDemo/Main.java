package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		BaseLoger[] loggers = new BaseLoger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger() };
//		for (BaseLoger logger : loggers) {
//			logger.log("Log mesası");
//		}

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
