package Lab2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
         /*Write a program that accepts a string input and outputs the number of characters in the string
        and the first and last character in separate lines. For 80 Chapter 2 Getting Started with Java
        example, if the input is, I like Java then the output would be 11
I
a*/
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a text: ");
        String text = key.nextLine();
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length()-1));

    }
}
