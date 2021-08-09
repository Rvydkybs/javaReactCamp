package interfaces;

public class CustomerManager {
	private Logger[] loggers;//birden çok loglama iþlemi
	public CustomerManager(Logger[] loggers) {//cunstructor-dependency injection
			this.loggers = loggers;
		}
	public void add(Customer customer) {
		
		System.out.println("müþteri eklendi "+customer.getFirst_name());
		Utils.runLoggers(loggers, customer.getFirst_name());//fonksiyon static olduðu için direk sýnýf ismiyle ulaþtýk
		/*
		 * DatabaseLogger logger=new DatabaseLogger();//katý baðýmlýlýk
		 * logger.log(customer.getFirst_name()+"veri tabanýna loglandý!");
		 */
	}
	public void delete(Customer customer) {
		System.out.println("müþteri silindi"+customer.getFirst_name());
		Utils.runLoggers(loggers, customer.getFirst_name());
	}
}
 