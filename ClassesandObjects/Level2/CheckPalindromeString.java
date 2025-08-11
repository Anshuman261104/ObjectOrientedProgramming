// Program to Check Palindrome String
//Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
//Check if the text is a palindrome.
//Display the result.
// With Comments

import java.util.Scanner;

public class CheckPalindromeString {
    private String text; // attribute

    // Constructor
    public CheckPalindromeString(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase(); // ignore spaces & case
        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a palindrome.");
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        CheckPalindromeString checker = new CheckPalindromeString(input);
        checker.displayResult();

        sc.close();
    }
}



