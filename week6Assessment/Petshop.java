package week6Assessment;

import java.util.Scanner;

public class Petshop extends Animal {

	public static void main(String[] args) {
		
	}

	@Override
	public void greet() {
		Scanner sc = new Scanner(System.in);
		String greet = "";
		System.out.println("What is your name?");
		String name = sc.nextLine();
		Dog Dog = new Dog();
		Dog.greet();
		System.out.println("The dog says"+ greet);
		Parrot Parrot = new Parrot();
		Parrot.greet();
		System.out.println("The Parrot says"+ greet+name);
	}

}
