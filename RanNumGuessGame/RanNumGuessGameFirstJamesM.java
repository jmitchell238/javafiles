/** 

Computer Science 1 - James Mitchell - Assigment 4:17 and 4:18

Random Number Guessing Game Enhancement

(USE DO-WHILE LOOP)

** Base Program **
   Write a program that generates a random number and asks the user to guess what the
   number is. If the user's guess is higher than the random number, the program should
   display "Too high, try again." If the user's guess is lower than the random number,
   the program should display "Too low, try again." The program should use a loop that
   repeats until the user correctly guesses the random number.
   
** Enhanced Program **
   Enhance the program that you wrote for the Programming Challenge 17 so it keeps a
   count of the number of guesses that the user makes. When the user correctly guesses
   the random number, the program should display the number of guesses.
   
(USE DO-WHILE LOOP)

*/


import javax.swing.JOptionPane;  // This is needed to display dialog boxes.

import java.util.Random; // This is needed to create random numbers.

public class RanNumGuessGameFirstJamesM
{


/**
   Function to convert String to integer for userGuess variable.
*/

    public static int convertInput(String input) 
    { 
        int userGuess = 0; // Initializes the userGuess variable to 0.
  
        // Convert the String to Int. If successful, program proceeds into 
        // if statement comparing guess to randomNum.
         try 
         {  
            userGuess = Integer.parseInt(input); 
         } 
         
        // If conversion unsuccessful, user will be informed a valid integer is
        // required and asked to enter a number again until an integer is entered or
        // the cancel button is pressed which will end the program. 
         catch (NumberFormatException e) 
         { 
           // This is thrown when the String contains characters other than digits. 
            JOptionPane.showMessageDialog(null, "Invalid Input, Please enter a valid Integer 1-100."); 
            
           // Ask the user again to enter a number.
            input = JOptionPane.showInputDialog("Please enter your guess of a number between 1 and 100.");
               if (input == null) // If the user presses cancel. Exit the program.
               {
                  System.exit(0);
               }
               
            userGuess = convertInput(input); // Call convertInput to parse Users input again.
         } 
        
        return userGuess; // If successful, return the result into userGuess variable.
                          // Then continue into the program.
    } 


/**
   The main method is the program's starting point.
*/
   
   public static void main(String[] args)
   {
   
  // Declare Variables for Program.
   String input;
   int userGuess = 0, randNum = 0;
   boolean guessCorrect = false;
   
  // Create a Random Number.
   Random randomNumber = new Random();
   randNum = randomNumber.nextInt(100) + 1;   // Get a random Int and assign it to randNum.
                                              // This number will be between 1 and 100.
                                                
  // Message Box telling user how to play the game.
   JOptionPane.showMessageDialog(null, "Thanks for playing the Random Number Guessing Game!\n"
                                  + "Please guess a number between 1 and 100.\n");                           
      
  // Loop to see if the user guesses the random number generated. 
   while ( guessCorrect == false )
   {
     // Get a guessed number from the user. 
      input = JOptionPane.showInputDialog("Please enter your guess of a number between 1 and 100.");
      
         if (input == null) // If the user presses cancel. Exit the program.
            {
               System.exit(0);
            }   
            
      userGuess = convertInput(input); // Call convertInput to parse Users input.
     
      
      if ( userGuess < randNum ) // If the users guess is lower than the random number.
         {
            JOptionPane.showMessageDialog(null, userGuess + " is Too low, try again!");
         }
      else if ( userGuess > randNum ) // If the users guess is higher than the rand number.
         {
            JOptionPane.showMessageDialog(null, userGuess + " is Too high, try again!");
         }
      else  // If the users guess is correct.
         {
            JOptionPane.showMessageDialog(null, "Congratulations! " + userGuess + 
                                                " is correct!");
            guessCorrect = true; // If userGuess is correct, change guessCorrect to true and exit
                                 // the while loop.
         }
   } 
         
    System.exit(0);      // This statement ends the program, is required for JOptionPane.
   }
}
