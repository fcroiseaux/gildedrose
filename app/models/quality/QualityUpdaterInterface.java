package models.quality;

import models.Item;

public interface QualityUpdaterInterface {

		void updateQualityOf(Item item);
		void updateQualityIfSellinNegativeOf(Item item);
}
