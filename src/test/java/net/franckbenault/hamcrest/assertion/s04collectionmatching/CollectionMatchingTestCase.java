package net.franckbenault.hamcrest.assertion.s04collectionmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.collection.IsEmptyCollection.emptyCollectionOf;
import static org.hamcrest.collection.IsEmptyIterable.emptyIterable;
import static org.hamcrest.collection.IsEmptyIterable.emptyIterableOf;
import static org.hamcrest.collection.IsIn.isIn;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.Matchers.contains;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class CollectionMatchingTestCase {
	
	@Test
	public void t01aEmpty() {
		
		Set<String> col = new HashSet<String>();
		assertThat(col,empty());
	}
	
	
	@Test
	public void t01bEmptyCollectionOf() {
		
		Set<String> col = new HashSet<String>();
		assertThat(col,emptyCollectionOf(String.class));
	}

	@Test
	public void t01cEmptyIterable() {
		
		List<String> col = new ArrayList<String>();
		assertThat(col,emptyIterable());
	}

	
	@Test
	public void t01dEmptyIerableOf() {
		
		List<String> col = new ArrayList<String>();
		assertThat(col,emptyIterableOf(String.class));
	}

	@Test
	public void t02aIsInCollection() {
		
		List<String> col1 = Arrays.asList("v1","v2");


		assertThat("v1",isIn(col1));
	}
	
	@Test
	public void t02bIsIntabs() {
		
		String tab[] = {"v1","v2"};


		assertThat("v1",isIn(tab));
	}
	
	@Test
	public void t02cHasSize() {
		
		List<String> col1 = Arrays.asList("v1","v2");
		assertThat(col1,hasSize(2));
	}
	
	@Test
	public void t02dContains() {
		
		List<String> col1 = Arrays.asList("v1","v2","v3");
		//contains = strict order all items
		assertThat(col1,contains("v1","v2", "v3"));
	}
}
