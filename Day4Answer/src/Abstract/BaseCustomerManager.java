package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
	// bunu implemente ederek artýk base bir sýnýftan iþlem yapabileceðiz
		@Override
		public void  Save(Customer customer) throws NumberFormatException, RemoteException {
			System.out.println("saved to: "+customer.firstName);
			
		}

}
