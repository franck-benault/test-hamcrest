package net.franckbenault.hamcrest.assertion.s07beanmatching;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import java.util.HashSet;
import java.util.Set;
import static org.hamcrest.beans.HasProperty.hasProperty;

import org.junit.Test;

public class BeanMatchingTestCase {

	@Test
	public void t01ahasProperty() {
		
		BeanSample bean = new BeanSample();
		
		assertThat(bean, hasProperty("name"));

	}
}
