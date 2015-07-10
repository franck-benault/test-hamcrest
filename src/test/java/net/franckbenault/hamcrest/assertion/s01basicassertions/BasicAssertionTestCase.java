package net.franckbenault.hamcrest.assertion.s01basicassertions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BasicAssertionTestCase {

	


	@Test
	public void t01AssertArrayEqualsTest() {
		
		int[] ints1 = {1,3};
		int[] ints2 = {1,3};

		
		assertThat(ints1,is(equalTo(ints2)));
	}

	@Test
	public void t02aAssertEquals() {
		
		String s1 = "a string";
		String s2 = "a string";
		
		assertThat(s1,is(equalTo(s2)));

	}
	
	@Test
	public void t02bAssertNotEquals() {
		
		String s1 = "String1";
		String s2 = "String2";
		
		assertThat(s1,is(not(equalTo(s2))));

	}
	
	@Test
	public void t03aAssertTrue() {
		
		boolean condition = true;
		
		assertThat(condition, is(true));
	}
	
	@Test
	public void t03bAssertFalse() {
		
		boolean condition = false;
		
		assertThat(condition,is(false));
	}
	
	@Test
	public void t04aAssertNull() {
		
		Object myObject = null;
		
		assertThat(myObject, nullValue());
	}
	
	@Test
	public void t04bAssertNotNull() {
		
		Object myObject = new Object();
		
		assertThat(myObject, notNullValue());
	}
	
	@Test
	public void t05aAssertSame() {
		Object o1 = new Object();
		Object o2 = o1;
		assertThat(o1,is(sameInstance(o2)));
		
	}
	
	@Test
	public void t05bAssertNotSame() {
		Object o1 = new Object();
		Object o2 = new Object();
		assertThat(o1, is(not(sameInstance(o2))));
		
		
	
	}
}
