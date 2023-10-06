package com.progpatterns.assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class Assignment1Tests {

	@Test
	void findLongestWordTest1()  {
		String s = "abpcplea";
		List<String> dictionary = Arrays.asList(new String[] {"ale", "apple", "monkey", "plea"});
		
		String expected = "apple";
		
		assertEquals(expected, Assignment1.findLongestWord(s, dictionary));
	}
	
	@Test
	void findLongestWordTest2()  {
		String s = "abpcplea";
		List<String> dictionary = Arrays.asList(new String[] {"a","b","c"});
		
		String expected = "a";
		
		assertEquals(expected, Assignment1.findLongestWord(s, dictionary));
	}
	
	@Test
	void gcdSortTest1()  {
		assertTrue(Assignment1.gcdSort(new int[] {7, 21, 3}));
	}
	
	@Test
	void gcdSortTest2()  {
		assertFalse(Assignment1.gcdSort(new int[] {5, 2, 6, 2}));
	}
	
	@Test
	void gcdSortTest3()  {
		assertTrue(Assignment1.gcdSort(new int[] {10, 5, 9, 3, 15}));
	}
	
}