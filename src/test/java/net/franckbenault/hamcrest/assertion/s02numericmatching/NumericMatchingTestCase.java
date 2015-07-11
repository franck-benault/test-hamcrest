package net.franckbenault.hamcrest.assertion.s02numericmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.number.IsCloseTo.closeTo;
import org.hamcrest.number.BigDecimalCloseTo;


import java.math.BigDecimal;

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
	
	@Test
	public void t03Between() {
		
		//between does not exist in hamcrest
		//but there is solutions
		
		int v1 =5;
		int v2 =4;
		int v3 =7;

		//two solutions
		assertThat(v1, is(both(greaterThan(v2)).and(lessThan(v3))));
		assertThat(v1, is(allOf(greaterThan(v2),lessThan(v3))));
		
	}
	
	@Test
	public void t04aCloseTo() {
		
		double v1 = 10.5;
		double v2 = 10.3;
		double delta = 0.4;
		
		assertThat(v1, is(closeTo(v2,delta)));
	}
	

	
	@Test
	public void t04bCloseToBigDecimal() {
		
		BigDecimal v1 = new BigDecimal(10.5);
		BigDecimal v2 = new BigDecimal(10.3);
		BigDecimal delta = new BigDecimal(0.4);
		
		assertThat(v1, is(BigDecimalCloseTo.closeTo(v2,delta)));
	}
	
	

}
