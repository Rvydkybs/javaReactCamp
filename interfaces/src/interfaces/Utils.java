package interfaces;

public class Utils {//static olanlar new edilemez
	public static void runLoggers(Logger[] loggers,String message) {//her seferinde for d�ng�s� �al��t�rmamak i�in
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
