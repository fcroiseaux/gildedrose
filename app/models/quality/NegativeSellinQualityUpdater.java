package models.quality;

import models.Item;

public class NegativeSellinQualityUpdater extends StandardQualityUpdater {
	@Override
	public void updateQualityOf(Item item) {
		if (item.getSellIn() < 0) {
			if (!item.getName().equals("Aged Brie")) {
				if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
					if (item.getQuality() > 0) {
						if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
							item.setQuality(item.getQuality() - 1);
						}
					}
				} else {
					item.setQuality(item.getQuality() - item.getQuality());
				}
			} else {
				if (item.getQuality() < 50) {
					item.setQuality(item.getQuality() + 1);
				}
			}
		}
	}
}