# test-hamcrest
Simple samples with hamcrest library
Matcher library

# Installation (Maven)
Last version 1,3 : July 2012
```
<dependency>
	<groupId>org.hamcrest</groupId>
	<artifactId>hamcrest-all</artifactId>
	<scope>test</scope>
	<version>1.3</version>
</dependency>
```
no dependency

# matching presentation
## First Matcher
```
	String s = "a string";		
	Matcher<String> m = is(equalTo(s));
```
this object m has a method matches(Object item):boolean

The matchers can be used outside the tests, but they are very useful in the tests.

# basic matching
## matching anything
assertThat("", anything());

## matching is equal to
```
assertThat(ints1,is(equalTo(ints2)));
```
## matching is not equal to
```
assertThat(s1,is(not(equalTo(s2))));
```

# numeric matching

# string matching

# Collection matching
## matching empty
```
assertThat(col,empty());
assertThat(col,emptyCollectionOf(String.class));
```