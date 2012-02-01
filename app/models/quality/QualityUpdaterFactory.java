package models.quality;

import models.Item;

public class QualityUpdaterFactory {

	public static QualityUpdaterInterface createFor(Item item)
	{
		if (item.getName().equals("Aged Brie"))
			return new AgedBrieQualityUpdater();
		else if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert"))
			return new BackstageQualityUpdater();
		else if (item.getName().equals("Sulfuras, Hand of Ragnaros"))
			return new SulfurasQualityUpdater();
		else if (item.getName().equals("Conjured Mana Cake"))
			return new ConjuredQualityUpdater();
		else
			return new StandardQualityUpdater();
	}
}
