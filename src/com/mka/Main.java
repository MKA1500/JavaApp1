package com.mka;

class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Hi, I'm new person. My name and age are not yet set.");
	}
	
	public Person(int age, String name) {
		this.setAge(age);
		this.setName(name);	
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
}

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person(24, "Maciej");	
		Person person2 = new Person(284, "Marcin");
		
		person1.speak();
		System.out.println(person1.getAge());
		person2.speak();
		System.out.println(person2.getAge());
		
		Person person3 = new Person();
		
		person3.setAge(21);
		person3.setName("Nikodem");
		person3.speak();
	}
}
