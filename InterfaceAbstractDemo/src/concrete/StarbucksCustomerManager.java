package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService checkService;
	
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		
		if(this.checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {System.out.println("Not a valid person");}
	}

	
}
