package net.franckbenault.hamcrest.assertion.s07beanmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.beans.HasPropertyWithValue;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class BeanMatchingTestCase {

	@Test
	public void t01ahasProperty() {
		
		//bean has name and age properties
		BeanSample bean = new BeanSample();
		assertThat(bean, HasProperty.hasProperty("name"));
	}
	
	@Test
	public void t01bhasPropertyWithValue() {
		
		//bean has name and age properties
		BeanSample bean = new BeanSample("Jan",25);
		assertThat(bean, HasPropertyWithValue.hasProperty("name",is("Jan")));

	}
}
