package Concorete;

import java.rmi.RemoteException;
import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckService customerCheckService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		customerCheckService=customerCheckService;	
	}
	@Override
	public void Save(Customer customer)throws NumberFormatException, RemoteException {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			 super.Save(customer);
		}
		else {
			System.out.println("not a real person");
		}
	}

	
}
