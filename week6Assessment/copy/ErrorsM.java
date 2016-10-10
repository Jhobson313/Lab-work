package week6Assessment.copy;

import java.util.Scanner;

public class ErrorsM {

  // Hint: This is a logic error. The intent of this program is to ask for a
    // rating and give one appropriate response. But it sometimes gives multiple
    // responses.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rate your experience from 1 and 5.");
        int answer = scanner.nextInt();

        // print out one appropriate response
        switch (answer) {
        case 1:
        	System.out.println("Bad");
        	break;
        case 2:
            System.out.println("Ouch! Sorry to hear that.");
            break;
        case 3:
            System.out.println("Hmm. Okay.");
            break;
        case 4:
        	System.out.println("Good");
        	break;
        case 5:
            System.out.println("Booyah! We rocked it!");
            break;
        default:
            System.out.println("That does not compute!!");
        }

        System.out.println("Goodbye");
        scanner.close();
    }
}