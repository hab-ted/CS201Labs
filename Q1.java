package Lab2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /* Input the user’s first, middle, and last name as three separate strings and display the name in
        the order of the first name, the middle initial, and the last name. Include the period after the
        middle initial. If the input strings are Wolfgang, Amadeus, and Mozart, for example, then the
        output would be Wolfgang A. Mozart. Use the console window for output*/
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter our first name: ");
        String firstName = key.nextLine();
        System.out.println("Please enter your middle name: ");
        String middleIntialName = key.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = key.nextLine();
        System.out.println(firstName + " " + middleIntialName.charAt(0)+"." +" " + lastName);

    }
}
