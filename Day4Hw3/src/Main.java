
public class Main {

	public static void main(String[] args) {
		Customer customer1=new Customer();
		Customer customer2=new Customer();
		Customer customer3=new Customer();
		CustomerManager customerManager=new CustomerManager();
		
		customer1.CustomerAdd("1453652","engin", "demiro?" ,"1994" );//oyuncular?n bilgileri
		customer2.CustomerAdd("3810832","r?veyda", "kayaba??" ,"1997" );
		customer3.CustomerAdd("1759640","engin", "dinemis" ,"1999" );
		
		Customer[] customers= {customer1,customer2,customer3};//oyuncular
		CompanyManager companyManager=new CompanyManager();
		
		//OYUNCULAR ???N ??LEMLER:
		customerManager.Sumbit(customers);//ekleme
		companyManager.control(customers);//kullan?c? kontrol etme
		companyManager.update(customers ,customerManager );//g?ncelleme
		companyManager.sold(customer1,3);//1.oyuncu i?in ?? sat??
		companyManager.sold(customer2,5);//1.oyuncu i?in ?? sat??
		companyManager.sold(customer3,9);//1.oyuncu i?in ?? sat??
		companyManager.delete(customers,customerManager);//silme
		
		
		
	}

}
