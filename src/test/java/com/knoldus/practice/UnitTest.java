package com.knoldus.practice;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import javafx.util.Pair;

public class UnitTest {
	@Test
	public void unitTestAdd()
	{
		RationalDemo rd= new RationalDemo();
		Pair<Integer,Integer> resa = rd.printAddRational(2, 5);
		
		int k = resa.getKey();
		int v = resa.getValue();
		
		assertEquals(2,k);
		assertEquals(5,v);
	}
	
	@Test
	public void unitTestMult()
	{
		RationalDemo rd2= new RationalDemo();
		Pair<Integer,Integer> resa = rd2.printMultRational(2, 5);
		
		int k = resa.getKey();
		int v = resa.getValue();
		
		assertEquals(2,k);
		assertEquals(5,v);
	}
	
	@Test
	public void unitTestSub()
	{
		RationalDemo rd3= new RationalDemo();
		Pair<Integer,Integer> resa = rd3.printSubRational(2, 5);
		
		int k = resa.getKey();
		int v = resa.getValue();
		
		assertEquals(2,k);
		assertEquals(5,v);
	}

}
