package models.quality;

import models.Item;

public class BackstageQualityUpdater extends StandardQualityUpdater {
	@Override
	public void updateQualityOf(Item item) {

		if (item.getQuality() < 50) {
			item.setQuality(item.getQuality() + 1);
		}

		if (item.getSellIn() < 11) {
			if (item.getQuality() < 50) {
				item.setQuality(item.getQuality() + 1);
			}
		}

		if (item.getSellIn() < 6) {
			if (item.getQuality() < 50) {
				item.setQuality(item.getQuality() + 1);
			}
		}
	}
}
