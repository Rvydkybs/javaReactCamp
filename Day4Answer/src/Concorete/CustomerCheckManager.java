package Concorete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		// TODO Auto-generated method stub
		
	}

	
}
