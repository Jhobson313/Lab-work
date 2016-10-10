package week6Assessment;

import java.util.Scanner;

public class ErrorG {

    public static void main(String[] args) {
        System.out.println("What is your favorite number?");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int product = 10 * number;
        System.out.println(number + " x 10 = " + product);

        in.close();
    }

}