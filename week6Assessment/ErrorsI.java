package week6Assessment;

import java.util.Scanner;

public class ErrorsI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is 2 + 2?");
        int answer = scanner.nextInt();

        if (answer == 4)
        	System.out.println("Correct!");
        
        System.out.println("Goodbye.");
        scanner.close();
    }
}