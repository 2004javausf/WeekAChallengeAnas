package com.revature.driver;

import com.revature.bean.*;
import java.util.Scanner;

public class Driver {
	
	/*
	 * New Java Project
	 *  Have a package structure that makes sense
		Make 2 beans
		Make a driver class (class that has the main method)
		Driver class- utilize each type of control statement
        			- utilize a wrapper class
        			- overload the same method 3 times
        Utilize the Scanner to take in user input to instantiate objects
        ex. If you have a Human object, take in user input to instantiate the Human object's name etc.
        Instantiate 2 objects of each type.
	 */

	// Scanner objects to receive user input
	public static Scanner scString = new Scanner(System.in);
	public static Scanner scInt = new Scanner(System.in);

	
	// Method using while loop to print out greetings
	public static void dowhileHello(int i) {
		 while(i > 0){
			System.out.println("Hello there!");
			i--;
		}
	}
		
	public static void main(String[] args) {
		
		// Use a for loop to print out a greeting, w/ the counter using the Integer wrapper class
		for (Integer i = 0; i < 1; i++) {
			dowhileHello(1);
		}
		
		
		// Instantiate 2 Animal Objects
		System.out.println("Let's create a new animal!");
		
		Animal a = new Animal();
		System.out.println("Please enter the animals name: ");
		String animalName = scString.nextLine();
		a.setName(animalName);
		System.out.println("Please enter the animal's class (reptile, bird, etc..): ");
		String animalClass = scString.nextLine();
		a.setAnimalClass(animalClass);
		System.out.println("Please enter the animal's age");
		int animalAge = scInt.nextInt();
		a.setAge(animalAge);
		
		
		// Create a new animal
		System.out.println();
		System.out.println("Let's create another new animal!");
		System.out.println("Please enter the animal's name: ");
		String animalName2 = scString.nextLine();
		System.out.println("Please enter the animal's class (reptile, bird, etc..): ");
		animalClass = scString.nextLine();
		System.out.println("Please enter the animal's age");
		animalAge = scInt.nextInt();
		
		// Overload constructor
		Animal b = new Animal(animalName2, animalClass, animalAge);

		
		// Instantiate 2 Game Objects
		System.out.println();
		System.out.println("Let's create a new video game!");
		
		Game g = new Game();
		System.out.println("Please enter the game's name: ");
		String gameName = scString.nextLine();
		g.setName(gameName);
		System.out.println("Please enter the game's publisher: ");
		String gamePub = scString.nextLine();
		g.setPublisher(gamePub);
		System.out.println("Please enter the year the game was published: ");
		int year = scInt.nextInt();
		g.setYear(year);
		System.out.println("Please enter what system the game is played on: ");
		String system = scString.nextLine();
		g.setSystem(system);
		
		
		// Create another game object
		System.out.println();
		System.out.println("Let's create another new video game!");
		System.out.println("Please enter the game's name: ");
		gameName = scString.nextLine();
		System.out.println("Please enter the game's publisher: ");
		gamePub = scString.nextLine();
		System.out.println("Please enter the year the game was published: ");
		year = scInt.nextInt();
		System.out.println("Please enter the system the game is played on:");
		system = scString.nextLine();
		
		// Overload game constructor to initialize new game object
		Game h = new Game(gameName, year, system);

		
		System.out.println("Please enter what you would like to see: ");
		System.out.println("(animal1 / animal2 / game1 / game2");
		String answer = scString.nextLine();
		
		do {
			switch (answer) {
		
			case "animal1":
				System.out.println(a);
				break;
			case "animal2":
				System.out.println(b);
				break;
			case "game1":
				System.out.println(g);
				break;
			case "game2":
				System.out.println(h);
				break;
			default:
				System.out.println("You didn't choose?");
			}
			
			System.out.println();
			System.out.println("Please enter what else you would like to see: ");
			System.out.println("(animal1 / animal2 / game1 / game2");
			answer = scString.nextLine();
		} while(!answer.isEmpty());
		
		System.out.println();
		System.out.println("Goodbye");
	}

}
