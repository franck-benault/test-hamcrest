package net.franckbenault.hamcrest.assertion.s04collectionmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.collection.IsEmptyCollection.emptyCollectionOf;
import static org.hamcrest.collection.IsEmptyIterable.emptyIterable;
import static org.hamcrest.collection.IsEmptyIterable.emptyIterableOf;

import java.util.ArrayList;
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

}
