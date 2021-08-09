package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerService {
//customer sýnýfý olduðu için interfacesini de ekledik
	void Save(Customer customer) throws NumberFormatException, RemoteException;
}
