
public class Main {

	public static void main(String[] args) {
		Customer customer1=new Customer();
		Customer customer2=new Customer();
		Customer customer3=new Customer();
		Customer[] customers= {customer1,customer2,customer3};//oyuncular
		CustomerManager customerManager=new CustomerManager();
		customer1.Customer("1453652","engin", "demiro?" ,"1994" );//oyuncular?n bilgileri
		customer2.Customer("3810832","r?veyda", "kayaba??" ,"1997" );
		customer3.Customer("1759640","engin", "dinemis" ,"1999" );
		customerManager.Sumbit(customers);
	}

}
