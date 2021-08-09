package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new SmsLogger(),new DatabaseLogger()};//iki elemanl� dizi-elemanlar de�i�ebilir
		CustomerManager customerManager=new CustomerManager(loggers);//diziyi g�nderdik
		Customer engin=new Customer(1,"engin","demiro�");
		customerManager.add(engin);

	}

}
