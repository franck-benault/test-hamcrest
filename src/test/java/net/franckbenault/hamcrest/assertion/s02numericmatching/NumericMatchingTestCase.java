package net.franckbenault.hamcrest.assertion.s02numericmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.sameInstance;


import org.junit.Test;

public class NumericMatchingTestCase {

	


	@Test
	public void t01AssertArrayEqualsTest() {
		
		int[] ints1 = {1,3};
		int[] ints2 = {1,3};

		
		assertThat(ints1,is(equalTo(ints2)));
	}


	

}
