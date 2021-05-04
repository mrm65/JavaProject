package concrete;

import abstracts.OrderService;
import entities.Campaign;
import entities.Game;
import entities.User;

public class OrderManager implements OrderService {

	@Override
	public void campaignWithSale(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " isimli kullan�c� " + game.getName() + " adl� oyunu " + campaign.getDiscount() + " indirim ile sat�n ald�");
		
	}

	@Override
	public void campaignWithoutSale(User user, Game game) {
		System.out.println(user.getFirstName() + " isimli kullan�c� " + game.getName() + " adl� oyunu sat�n ald�");
		
	}

}
