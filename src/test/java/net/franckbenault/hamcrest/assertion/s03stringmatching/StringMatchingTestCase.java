package net.franckbenault.hamcrest.assertion.s03stringmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEmptyString.isEmptyString;
import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;
import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;

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

	
	@Test
	public void t02aIsEqualIgnoringCase() {
		
		String s1 = "s";
		String s2 = "S";
	
		assertThat(s1,equalToIgnoringCase(s2));
	}

	@Test
	public void t02bIsEqualIgnoringWhiteSpace() {
		
		String s1 = "string";
		String s2 = " string ";
	
		assertThat(s1,equalToIgnoringWhiteSpace(s2));
	}
	
	
}
