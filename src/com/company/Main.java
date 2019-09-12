package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String motherString;

        System.out.print("Enter a string to be analyzed: ");
        motherString = scanner.nextLine();
        System.out.println();

        int palindromes = PalindromeQA.calculatePalindromes(motherString); // 11 substring palindromes, 13 potential palindromes, 21 substrings

        System.out.printf("String %s has %d palindromes%n", motherString, palindromes);
    }
}
