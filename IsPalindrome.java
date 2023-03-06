package hw5;

import java.util.Scanner;

public class IsPalindrome {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String inputString = scanner.nextLine();
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        }
        else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}


