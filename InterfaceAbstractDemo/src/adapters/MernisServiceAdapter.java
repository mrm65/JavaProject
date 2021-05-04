package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
	 KPSPublicSoap client = new KPSPublicSoapProxy();
	 try {
			boolean result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
							customer.getFirstName().toUpperCase(), 
							customer.getLastName().toUpperCase(), 
							customer.getDateOfBirth().getYear());
			return result;
		} 
		catch (NumberFormatException exception) {
			exception.printStackTrace();
		} 
		catch (RemoteException exception) {
			exception.printStackTrace();
		}
		return false;
		}
	}


