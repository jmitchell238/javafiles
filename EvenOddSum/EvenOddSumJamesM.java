/** 

Computer Science 1 - James Mitchell - Exam 2 P2

Even Odd Sum

Write a program named EvenOddSumYourName(EvenOddSumJamesM) that accepts 
integers from the user,and then prints the sum of the even and odd integers.
The program should continue asking for an integer until the user enters 
N or n when asked if they want to continue. 

(50 Points)

Hints:  Use a do while look with an if/else inside the loop to determine if 
the number is odd or even, and add to an appropriate accumulator.  
Modular division may help determine even/odd numbers.    

(USE DO-WHILE LOOP)

Sample Output:

Enter the number 43
Do you want to continue y/n? y
Enter the number 22
Do you want to continue y/n? y
Enter the number 7
Do you want to continue y/n? y
Enter the number 8
Do you want to continue y/n? n
Sum of even numbers: 30
Sum of odd numbers: 50

*/


import javax.swing.JOptionPane;  // This is needed to display dialog boxes.


public class EvenOddSumJamesM
{

/**
   The main method is the program's starting point.
*/

   public static void main(String[] args)
   {
   
     // Declare Variables.
      String input;     // Input from User.
      char repeat;      // First character of input.     
      int number = 0,   // Number user entered.
          evenSum = 0,  // Sum of Even numbers.
          oddSum = 0;   // Sum of Odd numbers.
   
     // Do While Loop to handle user input of numbers.
      do
      {
        // Get Number from user .
         input = JOptionPane.showInputDialog("Enter a number:");
         number = Integer.parseInt(input); // Parse input and place in number.
         
        // If-Else statement to handle Even and Odd numbers. 
         if(number % 2 == 0) // If when Number is divided by 2 and remainder of 0,
         {                   // then do the following statement. 
            
            evenSum += number; // Add user entered number to evenSum.
            
         }
         else  // If the number is divided by 2 and it has a remainder of 1,
         {     // then do the following statement.
            
            oddSum += number; // Add user entered number to oddSum.
            
         }
      
        // Display Dialog box asking if the user would like to enter another number. 
         input = JOptionPane.showInputDialog("Do you wish to continue?\n"
                                             + "Enter Y for yes or N for no:");         
         
         repeat = input.charAt(0);  // Get the first Character of input.
         
         
      } while (repeat == 'Y' || repeat == 'y'); // Perform loop again while the user
                                                // entered Y or y in the first character.
                                                // If N or n was entered, exit loop.
      
      
     // Display Dialog box showing user the sum of Even and Odd numbers they entered.
      JOptionPane.showMessageDialog(null, "The Sum of the even Numbers is: " + evenSum 
                                    + "\n\n" +
                                    "The Sum of the odd Numbers is: " + oddSum);
                                    
     // This statement ends the program, and is required for JOptionPane.
      System.exit(0);
   }
}
