package week6Assessment.copy;

import java.util.Scanner;

public class sampleB {

	    public static void main(String[] args) {
	        System.out.println("What is your name?");
	        Scanner in = new Scanner(System.in);
	        
	        String name = in.nextLine();

	        System.out.print("Hello " + name);

	       
	        in.close();
	    }

	}