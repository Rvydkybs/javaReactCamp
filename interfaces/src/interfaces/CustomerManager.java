package interfaces;

public class CustomerManager {
	private Logger[] loggers;//birden �ok loglama i�lemi
	public CustomerManager(Logger[] loggers) {//cunstructor-dependency injection
			this.loggers = loggers;
		}
	public void add(Customer customer) {
		
		System.out.println("m��teri eklendi "+customer.getFirst_name());
		Utils.runLoggers(loggers, customer.getFirst_name());//fonksiyon static oldu�u i�in direk s�n�f ismiyle ula�t�k
		/*
		 * DatabaseLogger logger=new DatabaseLogger();//kat� ba��ml�l�k
		 * logger.log(customer.getFirst_name()+"veri taban�na logland�!");
		 */
	}
	public void delete(Customer customer) {
		System.out.println("m��teri silindi"+customer.getFirst_name());
		Utils.runLoggers(loggers, customer.getFirst_name());
	}
}
 