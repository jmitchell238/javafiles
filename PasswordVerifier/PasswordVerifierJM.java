/*
CISP1020 - Computer Science II

Assignment - Chapter 9: #5 Password Verifier
    Imagine you are developing a software package for Amazon.com that requires
    users to enter their own passwords. Your software requires that users’
    passwords meet the following criteria:
        - The password should be at least six characters long.
        - The password should contain at least one uppercase and at least one lowercase letter.
        - The password should have at least one digit.

    Write a class that verifies that a password meets the stated criteria. Demonstrate the class
    in a program that allows the user to enter a password and then displays a message indicating
    whether it is valid or not.

Due Date: September 9, 2020

Student: James Mitchell
Date: 9-6-2020
 */

import javax.swing.JOptionPane; // Import JOPtionPane to display boxes and get input.

public class PasswordVerifierJM {

    public static void main(String[] args) {

        // Create a String Variable to hold User Password.
        String password = JOptionPane.showInputDialog(null,
                "Please Enter a password:\n" + "* Password must be at least six characters in length. *\n"
                        + "* Password must contain at least one uppercase letter and one lowercase letter. *\n"
                        + "* Password must contain at least 1 number. *");

        // Create an object "checkpass" of the PasswordCheckJM class.
        PasswordCheckJM checkPass = new PasswordCheckJM();

        // Display a message box that shows whether the password is valid or not.
        JOptionPane.showMessageDialog(null, checkPass.verifyPassword(password));

        // Needed to exit program due to JOPtionPane.
        System.exit(0);
    }

}