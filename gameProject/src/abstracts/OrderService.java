package abstracts;

import entities.Campaign;
import entities.Game;
import entities.User;

public interface OrderService {
		void campaignWithSale(User user,Game game,Campaign campaign);
		void campaignWithoutSale(User user,Game game);
}
