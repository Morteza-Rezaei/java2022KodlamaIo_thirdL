package homework_KodlamaIo.core.logging;

public class Databaselogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına loglandı :" + data);
	}

}
