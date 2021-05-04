package adapters;

import java.rmi.RemoteException;

import abstracts.UserCheckService;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		 KPSPublicSoap client = new KPSPublicSoapProxy();
		 try {
				boolean result=client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), 
								user.getFirstName().toUpperCase(), 
								user.getLastName().toUpperCase(), 
								user.getDateOfBirth().getYear());
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


