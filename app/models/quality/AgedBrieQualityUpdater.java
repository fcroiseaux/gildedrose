package models.quality;

import models.Item;

public class AgedBrieQualityUpdater extends StandardQualityUpdater {
	@Override
	public void updateQualityOf(Item item) {
		if (item.getQuality() < 50) {
			item.setQuality(item.getQuality() + 1);
		}
	}
}
