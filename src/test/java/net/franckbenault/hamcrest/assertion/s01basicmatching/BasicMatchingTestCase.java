package net.franckbenault.hamcrest.assertion.s01basicmatching;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;

import static ch.lambdaj.Lambda.on;
import static ch.lambdaj.Lambda.having;
import static ch.lambdaj.Lambda.select;
import static org.hamcrest.Matchers.lessThan;

public class BasicMatchingTestCase {

	




	@Test
	public void t01FirstMatching() {
		
		String s = "a string";
		String s1 = "a string";
		String s2 = "another string";
		
		Matcher<String> m = is(equalTo(s));
		assertTrue(m.matches(s1));
		assertFalse(m.matches(s2));
		

	}
	
	@Test
	public void t02MatcherInLambdaj() {
		
		List<Item> items = new ArrayList<Item>();
		items.add(new Item("a",1));
		items.add(new Item("b",20));
		items.add(new Item("c",2));
		
		List<Item> items2 = select(items,having(on(Item.class).getPrice(), lessThan(10)));

		assertEquals(items2.size(),2);

	}
	
	

}
