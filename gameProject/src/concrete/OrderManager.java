package concrete;

import abstracts.OrderService;
import entities.Campaign;
import entities.Game;
import entities.User;

public class OrderManager implements OrderService {

	@Override
	public void campaignWithSale(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " isimli kullanýcý " + game.getName() + " adlý oyunu " + campaign.getDiscount() + " indirim ile satýn aldý");
		
	}

	@Override
	public void campaignWithoutSale(User user, Game game) {
		System.out.println(user.getFirstName() + " isimli kullanýcý " + game.getName() + " adlý oyunu satýn aldý");
		
	}

}
