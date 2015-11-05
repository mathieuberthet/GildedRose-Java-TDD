package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GildedRoseTest
{
	List<Item> items;
	
	
	@Before
	public void before() {
		items = new ArrayList<>();
	}

	
	@Test
	public void lowerQualityAtEndDayTestWithoutItem() 
	{
		GildedRose.updateItems(items);
		assertEquals(0,items.size());
	}
	
	@Test
	public void lowerQualityAtEndDayTestForOneItem() 
	{
		items.add(new Item("Soliste", 65, 20));
		GildedRose.updateItems(items);
		for (Item item : items)
		{
			assertEquals(19, item.getQuality());
		}
	}
	
	@Test
	public void lowerQualityAtEndDayTestForSeveralItems()
	{
		items.add(new Item("salut", 50, 20));
		items.add(new Item("coucou", 85, 20));
		items.add(new Item("bonjour", 35, 20));
		items.add(new Item("bonsoir", 60, 20));
		items.add(new Item("au revoir", 45, 20));
		GildedRose.updateItems(items);
		for (Item item : items)
		{
			assertEquals(19, item.getQuality());
		}

	}
	
	@Test
	public void lowerSellInAtEndDayTestWithoutItem() 
	{
		GildedRose.updateItems(items);
		assertEquals(0,items.size());
	}
	
	@Test
	public void lowerSellInAtEndDayTestForOneItem() 
	{
		items.add(new Item("Soliste", 100, 20));
		GildedRose.updateItems(items);
		for (Item item : items)
		{
			assertEquals(99, item.getSellIn());
		}
	}
	
	@Test
	public void lowerSellInAtEndDayTestForSeveralItems()
	{
		items.add(new Item("salut", 100, 20));
		items.add(new Item("coucou", 100, 20));
		items.add(new Item("bonjour", 100, 20));
		items.add(new Item("bonsoir", 100, 20));
		items.add(new Item("au revoir", 100, 20));
		GildedRose.updateItems(items);
		for (Item item : items)
		{
			assertEquals(99, item.getSellIn());
		}

	}
	
	@Test
	public void FastLowerIfSellInPassedTestForListWithOneItems()
	{
		items.add(new Item("Soliste", 65, 20));
		GildedRose.qualityUpdateFast(items);
		for (Item item : items)
		{
			assertEquals(18, item.getQuality());
		}
	}
	
	@Test
	public void fastLowerIfSellInPassedTestForListSeveralItems()
	{
		items.add(new Item("salut", 50, 20));
		items.add(new Item("coucou", 85, 20));
		items.add(new Item("bonjour", 35, 20));
		items.add(new Item("bonsoir", 60, 20));
		items.add(new Item("au revoir", 45, 20));
		GildedRose.qualityUpdateFast(items);
		for (Item item : items)
		{
			assertEquals(18, item.getQuality());
		}
	}

}