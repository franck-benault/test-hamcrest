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

## Matcher in production code with Lambdaj
### Maven dependency
```
<dependency>
	<groupId>com.googlecode.lambdaj</groupId>
	<artifactId>lambdaj</artifactId>
	<version>2.3.3</version>
</dependency>
```
### sample code
You can writte with Lambdaj functional code
```
List<Item> items2 = select(items,having(on(Item.class).getPrice(), lessThan(10)));
```

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
## matching with the content of the collection
### hasSize
```
List<String> col1 = Arrays.asList("v1","v2");
assertThat(col1,hasSize(2));
```
### elements in a collection
#### contains
contains = strict order all items
```		
List<String> col1 = Arrays.asList("v1","v2","v3");
assertThat(col1,contains("v1","v2", "v3")); //OK
assertThat(col1,contains("v1","v2")); //Not OK
```
#### containsInAnyOrder
containsInAnyOrder = all items the order in not important
```		
List<String> col1 = Arrays.asList("v1","v2","v3");
assertThat(col1,containsInAnyOrder("v2","v1", "v3")); //OK
assertThat(col1,containsInAnyOrder("v2","v3")); //Not OK
```