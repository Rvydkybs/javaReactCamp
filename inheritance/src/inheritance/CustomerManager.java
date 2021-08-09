package inheritance;

import java.util.Iterator;

public class CustomerManager {//operasyon s�n�f�
	public void add(Customer customer) {//her �ocuk s�n�fa eri�ebilmek i�in anaf�n�ftan parametre �rettik
		System.out.println(customer.customerNumber);

	}
	//bulk insert
	public void addMultiple(Customer[] customers) {//birden �ok m��teri   i�in
		for(Customer customer:customers) {
			add(customer);//her m��teri i�in yukar�daki add �al��acak
		}

	}
}
