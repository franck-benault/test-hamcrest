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

# basic matching
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

