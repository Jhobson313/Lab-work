package day1;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
	System.out.println("Welcome to Grand Circus' Room Detail Generator!");
	
	System.out.println("Enter Length");
	double length = scanner.nextDouble();
			
	System.out.println("Enter Width");
	double width = scanner.nextDouble();
	
	System.out.println("Area");
	double area = length * width ;
	System.out.println(area);
	
	
	System.out.println("Perimeter");
	double perimeter = 2 * (length + width);
	System.out.println(perimeter);
	
	

	}
}
	
			
		
	
	
	
