package com.revature.bean;

public class Game {
	
	private String name;
	private int year;
	private String system;
	private String publisher;
	
	// Constructors
	public Game() {
		
	}
	
	public Game(String name) {
		this.name = name;
	}
	
	public Game(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public Game(String name, int year, String system) {
		this.name = name;
		this.year = year;
		this.system = system;
	}
	
	public Game(String name, String publisher, int year, String system) {
		this.name = name;
		this.publisher = publisher;
		this.year = year;
		this.system = system;
	}
	
	// Setter & Getter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", year=" + year + ", system=" + system + ", publisher=" + publisher + "]";
	}

}
