package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void lowerQualityAtEndDayTestWithoutItem() 
	{
		List<Item> itemVide = new ArrayList<>();
		GildedRose.updateItem(itemVide);
		for (Item items : itemVide)
		{
			assertEquals(19, items.getQuality());
		}
	}
	
	@Test
	public void lowerQualityAtEndDayTestForOneItem() 
	{
		List<Item> itemSolitaire = new ArrayList<>();
		itemSolitaire.add(new Item("Soliste", 65, 20));
		GildedRose.updateItem(itemSolitaire);
		for (Item item : itemSolitaire)
		{
			assertEquals(19, item.getQuality());
		}
	}
	
	@Test
	public void lowerQualityAtEndDayTestForSeveralItems()
	{
		List<Item> items = new ArrayList<>();
		items.add(new Item("salut", 50, 20));
		items.add(new Item("coucou", 85, 20));
		items.add(new Item("bonjour", 35, 20));
		items.add(new Item("bonsoir", 60, 20));
		items.add(new Item("au revoir", 45, 20));
		GildedRose.updateItem(items);
		for (Item item : items)
		{
			assertEquals(19, item.getQuality());
		}

	}
	
	@Test
	public void lowerSellInAtEndDayTestWithoutItem() 
	{
		List<Item> itemVide = new ArrayList<>();
		GildedRose.updateItem(itemVide);
		for (Item items : itemVide)
		{
			assertEquals(99, items.getSellIn());
		}
	}
	
	@Test
	public void lowerSellInAtEndDayTestForOneItem() 
	{
		List<Item> itemSolitaire = new ArrayList<>();
		itemSolitaire.add(new Item("Soliste", 100, 20));
		GildedRose.updateItem(itemSolitaire);
		for (Item item : itemSolitaire)
		{
			assertEquals(99, item.getSellIn());
		}
	}
	
	@Test
	public void lowerSellInAtEndDayTestForSeveralItems()
	{
		List<Item> items = new ArrayList<>();
		items.add(new Item("salut", 100, 20));
		items.add(new Item("coucou", 100, 20));
		items.add(new Item("bonjour", 100, 20));
		items.add(new Item("bonsoir", 100, 20));
		items.add(new Item("au revoir", 100, 20));
		GildedRose.updateItem(items);
		for (Item item : items)
		{
			assertEquals(99, item.getSellIn());
		}

	}

}