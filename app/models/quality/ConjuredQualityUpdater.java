package models.quality;

import models.Item;

public class ConjuredQualityUpdater extends StandardQualityUpdater {
	@Override
	public void updateQualityOf(Item item) {
		QualityUpdaterInterface twice = new StandardQualityUpdater();
		twice.updateQualityOf(item);
		twice.updateQualityOf(item);
	}
}
