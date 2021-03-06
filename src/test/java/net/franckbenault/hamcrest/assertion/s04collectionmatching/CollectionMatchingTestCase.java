package net.franckbenault.hamcrest.assertion.s04collectionmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.collection.IsEmptyCollection.emptyCollectionOf;
import static org.hamcrest.collection.IsEmptyIterable.emptyIterable;
import static org.hamcrest.collection.IsEmptyIterable.emptyIterableOf;
import static org.hamcrest.collection.IsIn.isIn;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.hamcrest.collection.IsIterableWithSize;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.not;



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
	public void t01dEmptyIterableOf() {
		
		List<String> col = new ArrayList<String>();
		assertThat(col,emptyIterableOf(String.class));
	}



	@Test
	public void t02aIsInCollection() {
		
		List<String> col1 = Arrays.asList("v1","v2");
		assertThat("v1",isIn(col1));
	}
	


	//Size
	@Test
	public void t03cHasSize() {
		
		List<String> col1 = Arrays.asList("v1","v2");
		assertThat(col1,hasSize(2));
	}
	
	//Size
	@Test
	public void t03dIterableWithSize() {
		
		Set<String> col1 = new HashSet<String>(Arrays.asList("v1","v2"));
		assertThat(col1,IsIterableWithSize.<String>iterableWithSize(2));
	}

	
	//Is a single element in a collection
	@Test
	public void t04aHasItem() {
		
		List<String> col1 = Arrays.asList("v1","v2","v3");
		assertThat(col1,hasItem("v2"));
	}

	//is a single element not in a collection
	@Test
	public void t04bNotHasItem() {
		
		List<String> col1 = Arrays.asList("v1","v2","v3");
		assertThat(col1,not(hasItem("v4")));
	}	
	

	
	@Test
	public void t05aContains() {
		
		List<String> col1 = Arrays.asList("v1","v2","v3");
		//contains = strict order all items
		assertThat(col1,contains("v1","v2", "v3"));
	}
	
	@Test
	public void t05bContainsInAnyOrder() {
		
		List<String> col1 = Arrays.asList("v1","v2","v3");
		//contains = contains all items but the order in not important
		assertThat(col1,containsInAnyOrder("v2","v1", "v3"));
	}
	
	@Test
	public void t05cHasItems() {
		
		List<String> col1 = Arrays.asList("v1","v2","v3");
		//contains = contains items but the order in not important
		assertThat(col1,hasItems("v3", "v1"));
	}
	
	@Test
	public void t05dIsIterableContainingInAnyOrder() {
	
		Set<String> col1 = new HashSet<String>(Arrays.asList("v1","v2","v3"));
		
		//contains = contains items but the order in not important
		assertThat(col1,IsIterableContainingInAnyOrder.containsInAnyOrder("v2","v1","v3"));	
	}
		
	@Test
	public void t05eContainsInOrder() {
			
		List<String> list = Arrays.asList("v1","v2","v3");
		
		//contains = contains items but the order is important
		assertThat(list,IsIterableContainingInOrder.contains("v1","v2","v3"));	

	}
		
	@Test
	public void t05dEveryItem() {
		
		List<Integer> col1 = Arrays.asList(2,3,4);
		assertThat(col1,everyItem(greaterThan(1)));
	}
	

}
