package com.company;

public class PalindromeQA {
    public static boolean isPalindrome(String string) {

        for(int i = 0; i < (string.length() / 2); i++) {   // iterates on the string, looking at a the first and last letter in a progressively shrinking window.

            char a = string.charAt(i); // first char in the window
            char b = string.charAt(string.length() - (1 + i)); // last char in the window

            if (!(a == b)) {   // if the two compared characters don't match, this isn't a palindrome
                return false;
            }
        }

        return true;
    }
}
