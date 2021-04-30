/*
CISP1020 - Computer Science **

Assignment - Chapter 9: #3 Sentence Capitalizer.
    Write a method that accepts a String object as an argument and returns a
    copy of the string with the first character of each sentence capitalized.
    For instance, if the argument is “hello. my name is Joe. what is your name?”
    the method should return the string “Hello. My name is Joe. What is your name?”
    Demonstrate the method in a program that asks the user to input a string and
    then passes it to the method. The modified string should be displayed on the
    screen.

Due Date - September 9, 2020 : 11:30 PM

Student: James Mitchell
Date: 9-5-2020
*/

import javax.swing.JOptionPane; // Import JOptionPane to display boxes and get input.

public class SentenceCapitalizerJM {

    public static void main(String[] args) {

        // Create a String input variable to hold sentence typed by user.
        String input = JOptionPane.showInputDialog("Please enter a sentence or two, without capital letters.");

        // Display the result of the capSentence method return value in a message box to
        // the user.
        JOptionPane.showMessageDialog(null, capSentence(input));

        // Needed to exit application when using JOptionPane.
        System.exit(0);
    }

    public static String capSentence(String input) {

        // Declare a variable to hold index value.
        int i = 0;

        // Create a StringBuilder object, initialize with user input.
        StringBuilder str = new StringBuilder(input);

        // Capitalize first letter of sentence.
        if (str.length() > 0) {
            str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
        }

        // Get the index of the first occurrence of ". "
        i = str.indexOf(". ");

        // Make a while loop in order to capitalize the letters of each new sentence.
        while (i != -1) {
            // Increment index value from the period to the space.
            i++;

            // Find the first character of sentence just incase two spaces were entered.
            while (i < str.length() && str.charAt(i) == ' ') {
                // Increment index value to next character, first character of new sentence.
                i++;
            }

            // Capitalize this letter.
            str.setCharAt(i, Character.toUpperCase(str.charAt(i)));

            // Get next index of ". "
            i = str.indexOf(". ", i);

        }
        return str.toString();
    }
}