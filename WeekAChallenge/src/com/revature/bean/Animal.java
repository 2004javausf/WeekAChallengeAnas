package com.revature.bean;

public class Animal {
	
	private String name;
	private String animalClass;
	private int age;
	private String legs;
	

	// Constructors
	public Animal() {	
	}
	
	public Animal(String name) {
		this.name = name;
	} 
	
	public Animal(String name, int age) {	
		this.name = name;
		this.age = age;
	}
	
	public Animal(String name, String animalClass, int age) {	
		this.name = name;
		this.age = age;
		this.animalClass = animalClass;	
	}
	
	// Setter & Getter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimalClass() {
		return animalClass;
	}

	public void setAnimalClass(String animalClass) {
		this.animalClass = animalClass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "Animal [Name = " + name + ", Class = " + animalClass + ", Age = " + age + "]";
	}

	

}
