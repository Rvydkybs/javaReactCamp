import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Concorete.NeroCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customermanager=new NeroCustomerManager();//istedi�imiz s�n�fa m��teri ekleyebiliriz
		customermanager.Save(new Customer(1,"engin","demiro�",1994,"02390239"));
	
	
	
	
	}
}
