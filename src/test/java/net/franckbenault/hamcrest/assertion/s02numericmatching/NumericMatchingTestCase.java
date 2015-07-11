package net.franckbenault.hamcrest.assertion.s02numericmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.lessThanOrEqualTo;



import org.junit.Test;

public class NumericMatchingTestCase {

	


	@Test
	public void t01aGreaterThan() {
		
		int v1 =7;
		int v2 =5;

		
		assertThat(v1,is(greaterThan(v2)));
	}


	@Test
	public void t01bGreaterThanOrEqualTo() {
		
		int v1 =7;
		int v2 =5;
		int v3 =7;

		
		assertThat(v1,is(greaterThanOrEqualTo(v2)));
		assertThat(v1,is(greaterThanOrEqualTo(v3)));
	}
	
	
	@Test
	public void t02aLessThan() {
		
		int v1 =5;
		int v2 =7;

		
		assertThat(v1,is(lessThan(v2)));
	}


	@Test
	public void t02bLessThanOrEqualTo() {
		
		int v1 =5;
		int v2 =7;
		int v3 =5;

		
		assertThat(v1,is(lessThanOrEqualTo(v2)));
		assertThat(v1,is(lessThanOrEqualTo(v3)));
	}

}
