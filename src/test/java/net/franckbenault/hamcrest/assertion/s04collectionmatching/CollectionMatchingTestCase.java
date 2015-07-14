package net.franckbenault.hamcrest.assertion.s04collectionmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.collection.IsEmptyCollection.emptyCollectionOf;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CollectionMatchingTestCase {
	
	@Test
	public void t01aEmpty() {
		
		List<String> col = new ArrayList<String>();
		assertThat(col,empty());
	}
	
	
	@Test
	public void t01bEmptyCollectionOf() {
		
		List<String> col = new ArrayList<String>();
		assertThat(col,emptyCollectionOf(String.class));
	}

}
