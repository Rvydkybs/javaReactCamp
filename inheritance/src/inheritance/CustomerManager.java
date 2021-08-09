package inheritance;

import java.util.Iterator;

public class CustomerManager {//operasyon sýnýfý
	public void add(Customer customer) {//her çocuk sýnýfa eriþebilmek için anafýnýftan parametre ürettik
		System.out.println(customer.customerNumber);

	}
	//bulk insert
	public void addMultiple(Customer[] customers) {//birden çok müþteri   için
		for(Customer customer:customers) {
			add(customer);//her müþteri için yukarýdaki add çalýþacak
		}

	}
}
