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
	public void t01aAssertGreaterThan() {
		
		int v1 =7;
		int v2 =5;

		
		assertThat(v1,is(greaterThan(v2)));
	}


	@Test
	public void t01bAssertGreaterThanOrEqualTo() {
		
		int v1 =7;
		int v2 =5;
		int v3 =7;

		
		assertThat(v1,is(greaterThanOrEqualTo(v2)));
		assertThat(v1,is(greaterThanOrEqualTo(v3)));
	}
	

}
