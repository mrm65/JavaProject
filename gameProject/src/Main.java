import java.time.LocalDate;

import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.OrderManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) {
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("Muhteþem kampanya");
		campaign.setDiscount(18);
		
		Game game = new Game();
		game.setId(1);
		game.setName("pubg");
		game.setPrice(100);
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Muhammed");
		user.setLastName("Ýnan");
		user.setDateOfBirth(LocalDate.of(1997, 9, 16));
		user.setNationalityId("56525412");
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		GameManager gameManager = new GameManager();
		gameManager.delete(game);
		
		OrderManager orderManager = new OrderManager();
		orderManager.campaignWithoutSale(user, game);
		orderManager.campaignWithSale(user, game, campaign);

	}

}
