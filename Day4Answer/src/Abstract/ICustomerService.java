package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerService {
//customer s�n�f� oldu�u i�in interfacesini de ekledik
	void Save(Customer customer) throws NumberFormatException, RemoteException;
}
