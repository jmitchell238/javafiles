// Computer Science 1 - James Mitchell - 2-12-2020 - Exam 1

// Cookie Calories
// A bag of cookies hold 40 cookies. The calorie information on the bag
// claims that there are 10 servings in the bag and that a serving equals
// 300 calories. Write a program that ask the user to enter the number of
// cookies he or she actually ate from the bag and then report the number of
// total calories consumed.
// 
// Be sure to use comments in your program, and to test your program before
// submitting it. 
// 
// Test Data: 5 cookies eaten should show 375 calories consumed.
// 25 cookies should show 1875 calories.
//

import javax.swing.JOptionPane;           // This statement tells the compiler 
                                          // to get the JOptionPane class

public class CookieCaloriesJamesMitchell
{
   public static void main(String[] args)
   {
   
   // Declare Variables for Program.
   int cookies = 0, calories = 75, totalCalories = 0;    // Each cookie is 75 calories.
   String cookiesEaten;
   
   
   // Request how many cookies the user has eaten.
   cookiesEaten = JOptionPane.showInputDialog("How many cookies have you eaten?");
   
   
   // Perform calculations.
   cookies = Integer.parseInt(cookiesEaten);  // This converts the users entry into an Integer.
   totalCalories = cookies * calories;
   
   
   // Display the calculation to the user.
   JOptionPane.showMessageDialog(null, "You ate " + cookies + " Cookies." + "\n"
                                 + "You consumed " + totalCalories + " calories.");
   
  
   
   System.exit(0);         // This is necessary when you use the JOptionPane class.
   
   }
}