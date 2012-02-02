package models;

import java.util.*;
import models.quality.*;
import models.sellin.*;

/**
 * Created by IntelliJ IDEA.
 * User: croiseaux
 * Date: 01/02/12
 * Time: 20:18
 * To change this template use File | Settings | File Templates.
 */
public class Inn {
    
    public static Inn theInn;
    
    public static Inn getInn() {
       if (theInn == null)
           theInn = new Inn();
        return theInn;
    }

    private List<Item> items;

    public Inn() {
        items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));
    }

    public List<Item> getItems() {
        return items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.size(); i++)
            updateItemQuality(items.get(i));
    }

    public static void updateItemQuality(Item item) {
        QualityUpdaterFactory.createFor(item).updateQualityOf(item);
        SellinUpdaterFactory.createFor(item).updateSellInOf(item);
    }

    public static void updateItemQuality0(Item item) {
        if (!item.getName().equals("Aged Brie")
                && !item.getName().equals(
                "Backstage passes to a TAFKAL80ETC concert")) {
            if (item.getQuality() > 0) {
                if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                    item.setQuality(item.getQuality() - 1);
                }
            }
        } else {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);

                if (item.getName().equals(
                        "Backstage passes to a TAFKAL80ETC concert")) {
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
        }

        if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
            item.setSellIn(item.getSellIn() - 1);
        }

        if (item.getSellIn() < 0) {
            if (!item.getName().equals("Aged Brie")) {
                if (!item.getName().equals(
                        "Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.getQuality() > 0) {
                        if (!item.getName()
                                .equals("Sulfuras, Hand of Ragnaros")) {
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
