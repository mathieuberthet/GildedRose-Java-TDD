package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ItemTest 
{
	private Item newItemtest;
	
	@Before
	public void init() 
	{
		newItemtest = new Item("agedBrie", 50, 20);
	}
	
	@Test
	public void testGetSellInItem()
	{
		assertEquals (50, newItemtest.getSellIn());
	}
	
	@Test
	public void testSetSellInItem()
	{
		newItemtest.setSellIn(50);
		assertEquals (50, newItemtest.getSellIn());
	}
	
	@Test
	public void testGetQualityItem()
	{
		assertEquals (20, newItemtest.getQuality());
	}
	
	@Test
	public void testSetQualityItem()
	{
		newItemtest.setQuality(20);
		assertEquals (20, newItemtest.getQuality());
	}
	
	@Test
	public void testGetNameItem()
	{
		assertEquals ("agedBrie", newItemtest.getName());
	}
	
	@Test
	public void testSetNameItem()
	{
		newItemtest.setName("agedBrie");
		assertEquals ("agedBrie", newItemtest.getName());
	}
}
