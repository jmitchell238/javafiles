/** 

Computer Science 1 - James Mitchell - Assigment 5.17 
April 4, 2020


Rock, Paper, Scissors Game

Write a program that lets the user play the game of Rock, Paper, Scissors
   against the computer. The program should work as follows.

1. When the program begins, a random number in the range of 1 through 3 is generated.
   If the number is 1, then the computer has chosen rock, If the number is 2, then the
   computer has chosen paper. If the number is 3, then the computer has chosen scissors.
   (Don't Display the computer's choice yet.)

2. The user enters his or her choice of "rock", "paper", or "scissors" at the keyboard.
   (You can use a menu if you prefer)

3. The computer's choice is displayed.

4. A winner is selected according to the following rules:
   - If one player choses rock and the other player chooses scissors, then rock wins.
      (The rock smashes the scissors)
   - If one player chooses scissors and the other player chooses paper, then the scissors wins.
      (Scissors cuts paper)
   - If one player chooses paper and the other player chooses rock, then paper wins.
      (Paper wraps rock)
   - If both players make the same choice, the game must be played again to determine the winner.
   
Be sure to divide the program into methods(3) that perform each task.

*/



import javax.swing.JOptionPane;  // This is needed to display dialog boxes.

import java.util.Random; // This is needed to create random numbers.

public class RockPaperJamesM
{
 
    
/**
   The main method is the program's starting point.
*/
   
   public static void main(String[] args)
   {
          
    // Declare Variables
    String input;
    int playAgain = 0;
    int userChoice = 0, compChoice = 0;    
    Random randomNum = new Random();
          
    // Message Box welcome people to the game.     
    JOptionPane.showMessageDialog(null,"Welcome to a game of Rock, Paper, Scissors. Good Luck!");   
    
    // Declare Special Integer for JOptionPane Confirm Dialog to ask user to play.
    int answer = JOptionPane.showConfirmDialog(null, "Would you like to play?"); // 0=Yes, 1=No, 2=Cancel
           
    // If the user choses Yes...
    if(answer == 0)
    {

   // Do While loop to handle the possible repeating of the game.
    do {
    
      // Get user Choice of Rock, Paper, or Scissors.  
      input = JOptionPane.showInputDialog(null, "Please enter the number beside your selection.\n" + 
                                                            "1 : Rock \n2 : Paper \n3 : Scissors \n");      
      // If the user presses cancel. Exit the program.  
         if (input == null)
         {
            System.exit(0);
         }   
    
       // Call userChoice to parse Users input.        
         userChoice = userChoiceMethod(input); 
      
       // Call compChoice to get Computers random Choice.  
         compChoice = compChoiceMethod(randomNum); 
       
       // Call compareChoice to determine who wins.
         compareChoiceMethod(userChoice, compChoice); 
         
       // Does the User want to play again?
         playAgain = playAgainMethod();  
         
       } while(playAgain == 0); // Do this loop while the user chose Yes play again.
       
       // Close Program if the user chose No.
       JOptionPane.showMessageDialog(null, "Thanks for Playing!");
     }
     
     // If the user chooses No, Close the Game.
     else
     {  
       // Close Program if the user chose No.
       JOptionPane.showMessageDialog(null, "Thanks for Playing!");
     } 
   }
   

   
/**
   Method to convert String to integer and return to userChoice variable.
*/

    public static int userChoiceMethod(String input)
    { 
      // Declare Varialbes for this method
      int userChoice = 0;
      
     // Convert the String to Int. If successful, program proceeds into 
     // if statement.
         try 
         {  
            userChoice = Integer.parseInt(input); 
         } 
         
        // If conversion unsuccessful, user will be informed a valid integer is
        // required and asked to enter a number again until an integer is entered or
        // the cancel button is pressed which will end the program. 
         catch (NumberFormatException e) 
         { 
           // This is thrown when the String contains characters other than digits. 
            JOptionPane.showMessageDialog(null, "Invalid Input, Please enter a valid Integer 1, 2, or 3."); 
            
           // Ask the user again to enter a number.
            input = JOptionPane.showInputDialog(null, "Please enter the number beside your selection.\n" + 
                                                                  "1 : Rock \n2 : Paper \n3 : Scissors \n");
              // If the user presses cancel. Exit the program.
               if (input == null) 
               {
                  System.exit(0);
               }
            
           // Call convertInput to parse Users input again.   
            userChoice = userChoiceMethod(input); 
         } 
         
        // If statement to determine if the user Chose a Valid Selection of 1: Rock, 2: Paper, or 3: Scissors. 
         if(userChoice < 1) // If user Choice is Less than 1.
         {
            // Get user Choice of Rock, Paper, or Scissors again.
             input = JOptionPane.showInputDialog(null, "Please enter the number beside your selection.\n" + 
                                                            "1 : Rock \n2 : Paper \n3 : Scissors \n" +
                                                            "Please only enter 1, 2, or 3");      
              // If the user presses cancel. Exit the program.
               if (input == null) 
               {
                  System.exit(0);
               }
               
           // Call convertInput to parse Users input again.    
            userChoice = userChoiceMethod(input); 

         }
        
        // If the users input is Greater Than 3, Ask them to enter a choice again. 
         else if(userChoice > 3)
         {
            // Get user Choice of Rock, Paper, or Scissors.  
             input = JOptionPane.showInputDialog(null, "Please enter the number beside your selection.\n" + 
                                                            "1 : Rock \n2 : Paper \n3 : Scissors \n" +
                                                            "Please only enter 1, 2, or 3");      
              // If the user presses cancel. Exit the program. 
               if (input == null) 
               {
                  System.exit(0);
               }
           
           // Call convertInput to parse Users input again.    
            userChoice = userChoiceMethod(input); 
         }
         
        // If the user entered a Valid Selection, return that selection to userChoice in Main method. 
         else
         {
         }    
      return userChoice; // If successful, return the result into userChoice variable.
                               // Then continue into the program.

    } 
    

/**
   Method to generate Random Num for Computer Selection.
*/
    public static int compChoiceMethod(Random random) 
    { 
     // Declare variable for this Method.
      int compChoice = 0;
      
     // Create a Random class Object
      Random randomNum = new Random();
      
     // Creat a Random number 1, 2, or 3. 
      compChoice = randomNum.nextInt(3) + 1;
      
     // Return the choice back to Main Method compChoice Variable.       
      return compChoice;   
    }  
   
    
/**
   Method to computer userChoice and compChoice
*/
    public static void compareChoiceMethod(int userChoice, int compChoice) 
    { 
     
     // If Statement to output Results of Game
      if (userChoice == 1 && compChoice == 3) // User Rock, Comp Scissors - User Wins
      {  
         JOptionPane.showMessageDialog(null,"CONGRATULATIONS, YOU WIN!\n\n" + 
                                             "You Chose : Rock, \nComputer Chose: Scissors\n" + 
                                             "\nRock smashes scissors!");
      }
      
      else if (userChoice == 2 && compChoice == 1)   // User Paper, Comp Rock - User Wins
      {
         JOptionPane.showMessageDialog(null,"CONGRATULATIONS, YOU WIN!\n\n" +  
                                             "You Chose : Paper, \nComputer Chose: Rock\n" +
                                             "\nPaper wraps rock!");
      }
      
      else if (userChoice == 3 && compChoice == 2)    // User Scissors, Comp Paper - User Wins
      {
         JOptionPane.showMessageDialog(null,"CONGRATULATIONS, YOU WIN!\n\n" +  
                                             "You Chose : Scissors, \nComputer Chose: Paper\n" +
                                             "\nScissors cuts paper!");
      }
      
      else if (compChoice == 1 && userChoice == 3)    // Comp Rock, User Scissors - Computer Wins
      {
         JOptionPane.showMessageDialog(null,"Sorry, You Lost.\n\n" + 
                                             "You Chose : Scissors, \nComputer Chose: Rock\n" + 
                                             "\nRock smashes scissors!");
      }
      
      else if (compChoice == 2 && userChoice == 1)    // Comp Paper, User Rock - Computer Wins
      {
         JOptionPane.showMessageDialog(null,"Sorry, You Lost.\n\n" +  
                                             "You Chose : Rock, \nComputer Chose: Paper\n" +
                                             "\nPaper wraps rock!");
      }
      
      else if (compChoice == 3 && userChoice == 2)    // Comp Scissors, User Paper - Computer Wins
      {
         JOptionPane.showMessageDialog(null,"Sorry, You Lost.\n\n" +  
                                             "You Chose : Paper, \nComputer Chose: Scissors\n" +
                                             "\nScissors cuts paper!");
      } 
            
      else  // Tied, Play Again
      {
         JOptionPane.showMessageDialog(null,"Tied Game, Choose again.");
      }     
 
    } 
   
   
   
/**
   Method to Ask if the User wants to play again.
*/   
   public static int playAgainMethod()
    {
    int answer = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
       // If statement to decide what to return to main method do while loop 
   
      return answer;
    }
   
}
