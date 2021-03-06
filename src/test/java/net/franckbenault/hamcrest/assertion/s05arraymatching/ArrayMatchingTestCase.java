package net.franckbenault.hamcrest.assertion.s05arraymatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsArrayWithSize.emptyArray;
import static org.hamcrest.collection.IsIn.isIn;
import static org.hamcrest.collection.IsArray.array;
import static org.hamcrest.collection.IsArrayContaining.hasItemInArray;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.hamcrest.collection.IsArrayContainingInOrder.arrayContaining;

import static org.hamcrest.collection.IsArrayWithSize.arrayWithSize;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;


import org.junit.Test;

public class ArrayMatchingTestCase {
	

	@Test
	public void t01aEmptyArray() {
		
		String tab[] = {};
		assertThat(tab,emptyArray());
	}

	
	
	@Test
	public void t02aIsIntabs() {
		
		String tab[] = {"v1","v2"};
		assertThat("v1",isIn(tab));
	}

	//Size
	@Test
	public void t03aArrayWithSize() {
		String tab[] = {"v1","v2"};
		assertThat(tab,arrayWithSize(2));
	}

	
	//Is a single element in an Array
	//Is a single element not in an Array
	@Test
	public void t04aHasItemInArray() {
		
		String tab[] = {"v1","v2","v3"};
		assertThat(tab,hasItemInArray("v2"));
		assertThat(tab,not(hasItemInArray("v4")));
	}

	
	
	
	@Test
	public void t05aArrayContainingInAnyOrder() {
		String tab1[] = {"v1","v2","v3"};
		String tab2[] = {"v2","v1","v3"};
		assertThat(tab1,arrayContainingInAnyOrder(tab2));
	}
	
	
	@Test
	public void t05bArrayContainingInOrder() {
		String tab1[] = {"v1","v2","v3"};
		String tab2[] = {"v1","v2","v3"};
		assertThat(tab1,arrayContaining(tab2));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void t06aIsArray() {
		
		String tab1[] = {"v1","v2","v3"};
		//check strict order and all elements
		assertThat(tab1,array(is("v1"),is("v2"),is("v3")));
	}
}
