
// set the package name
package com.dellpogie;

// add reference to the Java Standard Library
import java.util.Scanner;

// create the palindrome class
public class PalindromeChecker {

    // entry point in Java
    public static void main(String[] args) {

        // user input listener
        Scanner scanner = new Scanner(System.in);

        // display intro
        System.out.println("\nDellPogie 2024 - Java Portfolio using the Java Standard Library\n");
        System.out.println("PALINDROME CHECKER");
        System.out.println("A palindrome is a word, phrase, number, or other sequence of characters that");
        System.out.println("reads the same forward and backward (ignoring spaces, punctuation, and capitalization).");

        // ask the user to input a string
        System.out.print("\nEnter any text to check if it is a Palindrome: ");

        // scan for user input
        String input = scanner.nextLine();

        /* remove the non-alphanumeric characters and convert it to lowercase
           Note: I have used a regular expressions or regex to clean the data */
        String strUserTextInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // logic to check if the text is palindrome
        if (isPalindrome(strUserTextInput)) {
            System.out.println("The text '" + strUserTextInput + "' is a Palindrome!");
        } else {
            System.out.println("The text '" + strUserTextInput + "' is not a Palindrome!\n");
        }

        // clear the memory
        scanner.close();

    }

    // method with logic to check if the text input is palindrome or not
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        // set to true if text input is palindrome
        return true;

    }
}
