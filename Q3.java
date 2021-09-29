package Lab2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
 /*Write a program that accepts a word and prints out the middle character. The length of the
        input word is odd. For example, if the input is magnificent, which has 11 characters, you output
        the sixth character f. You use the division operator /. This operator returns only the quotient. For
        example, the expression 10/4 would result in 2 (not 2.5).*/
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a text: ");
        String text1 = key.nextLine();
        int x=text1.length()/2;
        System.out.println(text1.charAt(x));

    }
}
