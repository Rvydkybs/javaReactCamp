package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
	// bunu implemente ederek art�k base bir s�n�ftan i�lem yapabilece�iz
		@Override
		public void  Save(Customer customer) throws NumberFormatException, RemoteException {
			System.out.println("saved to: "+customer.firstName);
			
		}

}
