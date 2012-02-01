package models.sellin;

import models.Item;

public class SellinUpdaterFactory {

	public static SellinUpdaterInterface createFor(Item item)
	{
		if (item.getName().equals("Sulfuras, Hand of Ragnaros"))
			return new SulfurasSellinUpdater();
		else
			return new StandardSellinUpdater();
	}
}
