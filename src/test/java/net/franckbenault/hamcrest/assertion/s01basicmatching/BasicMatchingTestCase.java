package net.franckbenault.hamcrest.assertion.s01basicmatching;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.hamcrest.Matcher;
import org.junit.Test;

public class BasicMatchingTestCase {

	




	@Test
	public void t01FirstMatching() {
		
		String s = "a string";
		String s1 = "a string";
		String s2 = "another string";
		
		Matcher<String> m = is(equalTo(s));
		assertTrue(m.matches(s1));
		assertFalse(m.matches(s2));
		

	}
	

}
