package Adapters;
import java.rmi.RemoteException;
import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) throws RemoteException, NumberFormatException {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula((long)customer.id , customer.firstName.toUpperCase(), customer.lastName.toUpperCase(),customer.dateOfBirth);
	}

}
