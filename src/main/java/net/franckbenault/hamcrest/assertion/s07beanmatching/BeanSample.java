package net.franckbenault.hamcrest.assertion.s07beanmatching;

public class BeanSample {

	private int age;
	
	private String name;

	public BeanSample() {
	}
	
	public BeanSample(String name, int age) {
		this.name = name;
		this.age =age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
