package net.franckbenault.hamcrest.assertion.s06mapmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.collection.IsMapContaining.hasKey;
import static org.hamcrest.collection.IsMapContaining.hasValue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapMatchingTestCase {

	@Test
	public void t01aHasEntry() {
		
		Map<Integer, String> myMap = new HashMap<Integer, String>();
	    myMap.put(1, "one");
	    myMap.put(2, "two"); 
	    assertThat(myMap, hasEntry(1,"one"));
	}
	
	@Test
	public void t01bHasKey() {
		
		Map<Integer, String> myMap = new HashMap<Integer, String>();
	    myMap.put(1, "one");
	    myMap.put(2, "two"); 
	    assertThat(myMap, hasKey(1));
	}
	
	@Test
	public void t01cHasValue() {
		
		Map<Integer, String> myMap = new HashMap<Integer, String>();
	    myMap.put(1, "one");
	    myMap.put(2, "two"); 
	    assertThat(myMap, hasValue("two"));
	}
}
