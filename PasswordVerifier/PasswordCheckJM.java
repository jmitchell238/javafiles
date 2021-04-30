/*
CISP1020 - Computer Science II

Assignment - Chapter 9: #5 Password Verifier

    This is the Class to check/verify the user entered password.
        - The password should be at least six characters long.
        - The password should contain at least one uppercase and at least one lowercase letter.
        - The password should have at least one digit.

Due Date: September 9, 2020

Student: James Mitchell
Date: 9-6-2020
 */

public class PasswordCheckJM {

    // Create a method called verifyPassword to validate password.
    public String verifyPassword(String password) {

        // Create variables to hold verified answers.
        boolean hasUpCase = false;
        boolean hasLowCase = false;
        boolean hasDigit = false;

        // IF statement to check if password is long enough.
        if (password.length() >= 6) {

            // FOR LOOP, this for loop will check ever character in user password.
            for (int i = 0; i < password.length(); i++) {

                // This If statement will begin by checking requirements, if they are met, the user will be
                // informed their password is valid. If not, then the Else If statements will check the current
                // character. This is to prevent searching any further than
                // necessary and speeding up program.
                if (hasUpCase && hasLowCase && hasDigit) { // If hasUpCase, hasLowCase, and hasDigit are all TRUE....
                    return "Your password is valid.";

                } else if (Character.isUpperCase(password.charAt(i))) { // If the current index is a Uppercase
                    hasUpCase = true; // character, set hasUpCase to True.

                } else if (Character.isLowerCase(password.charAt(i))) { // If the current index is a Lowercase
                    hasLowCase = true; // character, set hasLowCase to True.

                } else if (Character.isDigit(password.charAt(i))) { // If the current index is a Digit 0-9
                    hasDigit = true; // character, set hasDigit to True.

                }
            }

            // If statement to check if requirements are met or not.
            // This would ONLY run if every every character in the Password had to be checked.
            if (hasUpCase && hasLowCase && hasDigit) { // If hasUpCase, hasLowCase, and hasDigit are all TRUE....
                return "Your password is valid.";
            } else { // If any of the 3 requirements above are false....
                return "Your password is NOT valid.";
            }

        } else { // If password isn't long enough, Send a String back telling user that pass is
                 // short.
            return "Your password is to short.";
        }
    }
}
