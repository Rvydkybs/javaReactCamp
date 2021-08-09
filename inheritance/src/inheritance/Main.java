package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin=new IndividualCustomer();
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		engin.customerNumber="278312";
		hepsiBurada.customerNumber="000";
		CustomerManager customerManager=new CustomerManager();
//		customerManager.add(hepsiBurada);//polimorphism
//		customerManager.add(engin);//polimorphism
		Customer[] customers= {engin,hepsiBurada};
		customerManager.addMultiple(customers);//polimorphism-birden çok müþteri eklendi
	}

}
