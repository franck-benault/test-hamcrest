package net.franckbenault.hamcrest.assertion.s03stringmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEmptyString.isEmptyString;
import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;


import org.junit.Test;

public class StringMatchingTestCase {

	@Test
	public void t01aEmpty() {
		
		String s1 = "";
	
		assertThat(s1,isEmptyString());
	}
	
	@Test
	public void t01bEmptyOrNull() {
		
		String s1 = "";
		String s2 = null;
	
		assertThat(s1,isEmptyOrNullString());
		assertThat(s2,isEmptyOrNullString());
	}

}
