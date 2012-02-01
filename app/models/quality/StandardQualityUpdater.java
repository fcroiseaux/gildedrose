package models.quality;

import models.Item;

public class StandardQualityUpdater implements QualityUpdaterInterface {
	@Override
	public void updateQualityOf(Item item) {
		if (item.getQuality() > 0) {
			if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
				item.setQuality(item.getQuality() - 1);
			}
		}
	}
	
	@Override
	public void updateQualityIfSellinNegativeOf(Item item) {
		new NegativeSellinQualityUpdater().updateQualityOf(item);
	}
}