package com.bookpractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {
	
	public PersonTest() {
		
	}

@Test
public void shouldReturnHelloWorld() {
	
	Person syed = new Person();
	assertEquals("Hello World", syed.helloWorld()); 
}
	@Test
	public void shouldReturnSyed() {
		Person abdullah = new Person();
		Person joe = new Person();
		assertEquals("hello abdullah",Person.hello("abdullah"));
	}
}
