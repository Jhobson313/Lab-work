package week6Assessment;

import java.util.Scanner;

public class Parrot  extends Animal{

	@Override
	public void greet() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		Parrot Parrot = new Parrot();
		String greet = "hello"; 
		Parrot.greet();
		System.out.println(greet + name);
	}

}
