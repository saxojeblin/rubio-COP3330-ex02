/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        String input;
        Scanner sc = new Scanner (System.in);

        System.out.print("What is the input string? ");
        input = sc.next();

        int length = input.length();

        System.out.println(input + " has " + length + " characters.");

    }
}
