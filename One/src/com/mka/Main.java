package com.mka;

public class Main {
	public static void main(String[] args) {
		Person.description = "I am a person";

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

		person2.presentDescription();
	}
}
