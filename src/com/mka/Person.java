package com.mka;

public class Person {
	private String name;
	private int age;
	public static String description;
	public final static int CONSTANT_LUCKY_NUMBER = 9;
	public static int count = 0;
	
	public Person() {
		this("Calling another constructor");
		System.out.println("Hi, I'm new person. My name and age are not yet set.");
		this.incrementAndPrintCount();
	}
	
	public Person(int age, String name) {
		this.setAge(age);
		this.setName(name);
		this.incrementAndPrintCount();
	}
	
	public Person(String text) {
		System.out.println(text);
	}
	
	private void incrementAndPrintCount() {
		count++;
		System.out.println("Count now: " + count);
		System.out.println(this);
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public void speak() {
		System.out.println(this.name + " " + this.age);
	}
	
	public void presentDescription() {
		System.out.println(this.description + " and the lucky number is: " + CONSTANT_LUCKY_NUMBER);
	}
}