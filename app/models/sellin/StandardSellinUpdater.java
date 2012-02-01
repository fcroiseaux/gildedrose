package models.sellin;

import models.Item;

public class StandardSellinUpdater implements SellinUpdaterInterface {
	@Override
	public void updateSellInOf(Item item) {
        item.setSellIn(item.getSellIn()-1);
		
	}
}