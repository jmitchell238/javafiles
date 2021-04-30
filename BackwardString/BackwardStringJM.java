/*
CISP1020 - Computer Science II

Assignment - Chapter 9: #1 Backward String
    Write a method that accepts a String object as an argument and displays
    its contents backward. For instance, if the string argument is “gravity”
    the method should display -“ytivarg”. Demonstrate the method in a program
    that asks the user to input a string and then passes it to the method.


Due Date - September 9, 2020 : 11:30 PM

Student: James Mitchell
Date: 9-1-2020
 */

import javax.swing.JOptionPane; // Import JOptionPane to display boxes and get input

public class BackwardStringJM {

    public static void main(String[] args) {

        // Get input from user.
        String input = JOptionPane.showInputDialog(null, "Please enter a string you want reversed.");
        backwardString(input); // Pass user input into backwardString Method to be reversed.

    }

    // backwardString Method: This receives input variable from main method
    // and reverses that string to present back to the user.
    public static void backwardString(String input) {

        char[] inputArray = input.toCharArray(); // Create a char array to hold each character from user input.
        int left = 0; // Create a control variable for left side of char array.
        int right = inputArray.length - 1; // Create a control variable for right side of char array.

        // for loop: This will modify the "inputArray"
        // This for loop will take the character at the index of "left" and place it
        // temporarily in a char "temp" variable.
        // Then it will place the character at the index of "right" in inputArray into
        // the index of "left".
        // It will them place the character placed in the "temp" variable into the
        // inputArray at the "right" index.
        // This will have swapped those characters.
        // After each loop it will +1 to "left" variable and -1 to the "right" variable.
        // Once the left becomes = to the right variable then the loop will quit. This
        // would be the middle character of the
        // inputArray which would not need to be swapped.
        for (left = 0; left < right; left++, right--) {
            char temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
        }

        // Create a String variable to place the inputArray characters in, creating a
        // new string.
        String backwardsInput = String.valueOf(inputArray); // Create a String variable to place the inputArray
                                                            // characters in creating a new string.

        // Display the Original input, followed by the backwards input in a message box.
        JOptionPane.showMessageDialog(null,
                "The String entered was:\n" + input + "\n\n" + "This String Backwards:\n" + backwardsInput);
    }

}