package kodlamaIoWeek3Homework.logging;

public class FilelLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Dosya loglandı: " + data);	
	}

}
