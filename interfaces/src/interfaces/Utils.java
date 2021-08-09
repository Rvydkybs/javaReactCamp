package interfaces;

public class Utils {//static olanlar new edilemez
	public static void runLoggers(Logger[] loggers,String message) {//her seferinde for döngüsü çalýþtýrmamak için
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
