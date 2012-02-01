package models;

import org.junit.Assert;
import org.junit.Test;

public class InnTest {

	@Test
	public void testConjured() throws Exception {
		int initialQuality = 6;
		Item conjured = new Item("Conjured Mana Cake", 3, initialQuality);
		Item notConjured = new Item("Mana Cake", 3, initialQuality);
		Inn.updateItemQuality(conjured);
		Inn.updateItemQuality(notConjured);
		Assert.assertTrue((conjured.getQuality() - initialQuality) == 2 * (notConjured.getQuality() - initialQuality));
	}
	
	@Test
	public void testConjured2() throws Exception {
		int initialQuality = 6;
		Item conjured = new Item("Conjured Mana Cake", 3, initialQuality);
		Item notConjured = new Item("Mana Cake", 3, initialQuality);
		Inn.updateItemQuality0(conjured);
		Inn.updateItemQuality0(notConjured);
		Item conjured2 = new Item("Conjured Mana Cake", 3, initialQuality);
		Item notConjured2 = new Item("Mana Cake", 3, initialQuality);
		Inn.updateItemQuality(conjured2);
		Inn.updateItemQuality(notConjured2);	
		
		Assert.assertTrue(conjured.getQuality() == conjured2.getQuality() && 
				notConjured.getQuality() == notConjured2.getQuality());
	}

	@Test
	public void testStandard() throws Exception {
		int initialQuality = 20;
		Item i1 = new Item("+5 Dexterity Vest", 10, initialQuality);
		Inn.updateItemQuality0(i1);
		int q1 = i1.getQuality() - initialQuality;
		
		Item i2 = new Item("+5 Dexterity Vest", 10, initialQuality);
		Inn.updateItemQuality(i2);
		int q2 = i2.getQuality() - initialQuality;
		
		Assert.assertTrue(q1 == q2);
	}
	
	@Test
	public void testBrie() throws Exception {
		int initialQuality = 0;
		Item i1 = new Item("Aged Brie", 2, initialQuality);
		Inn.updateItemQuality0(i1);
		int q1 = i1.getQuality() - initialQuality;
		
		Item i2 = new Item("Aged Brie", 2, initialQuality);
		Inn.updateItemQuality(i2);
		int q2 = i2.getQuality() - initialQuality;
		
		Assert.assertTrue(q1 == q2);
	}
	
	@Test
	public void testBackstage() throws Exception {
		int initialQuality = 20;
		Item i1 = new Item("Backstage passes to a TAFKAL80ETC concert", 15, initialQuality);
		Inn.updateItemQuality0(i1);
		int q1 = i1.getQuality() - initialQuality;
		
		Item i2 = new Item("Backstage passes to a TAFKAL80ETC concert", 15, initialQuality);
		Inn.updateItemQuality(i2);
		int q2 = i2.getQuality() - initialQuality;
		
		Assert.assertTrue(q1 == q2);
	}
	
	@Test
	public void testSulfuras() throws Exception {
		int initialQuality = 20;
		Item i1 = new Item("Sulfuras, Hand of Ragnaros", 0, initialQuality);
		Inn.updateItemQuality0(i1);
		int q1 = i1.getQuality() - initialQuality;
		
		Item i2 = new Item("Sulfuras, Hand of Ragnaros", 0, initialQuality);
		Inn.updateItemQuality(i2);
		int q2 = i2.getQuality() - initialQuality;
		
		Assert.assertTrue(q1 == q2);
	}
	
}
