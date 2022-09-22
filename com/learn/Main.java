package com.learn;
import java.util.Scanner;
import java.lang.StringBuilder;



public class Main {
    public static void main(String[] args) {

                // Invoke the Scanner class
                Scanner myVar = new Scanner(System.in);
                System.out.println("Please enter a string: ");

                //Assign the user input to a variable
                String input = myVar.nextLine();

                //Convert the input to lowercase
                String getIt = input.toLowerCase();
                StringBuilder sb = new StringBuilder(getIt);

                //Reverse the user input
                sb.reverse();

                //Convert the reversed input to a string
                String finish = sb.toString();
                System.out.println(finish);



    }
}