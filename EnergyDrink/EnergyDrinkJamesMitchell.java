/**

Computer Science 1 - James Mitchell - Assignment 2:16

Energy Drink Consumption Program
A soft drink company recently surveyed 12,467 of its customers and found that
approximately 14 percent of those surveyed purchased one or more energy drinks
per week. Of those customers who purchase energy drinks, approximately 64 
percent of them prefer citrus-flavored energy drinks.This program will display
The approximate number of customers in the survey who purchase one or more
energy drinks per week.
And the approximate number of customers in the survey who prefer citrus-flavored
energy drinks.

*/

import javax.swing.JOptionPane;  // This is needed to display dialog boxes.



public class EnergyDrinkJamesMitchell
{

   /**
   The main method is the program's starting point.
   */

   public static void main(String[] args)
   {
   
   // Declare Variables for Program.
   double totalSurveyed = 12467, purchased = 0, preferCitrus = 0;      // Declaring doubles since we are dealing with fractions.
   int purchasedInt = 0, preferInt = 0;                                // Declaring integers to hold approximate numbers.
   
   // Make Calculations Needed.
   purchased = totalSurveyed * .14;   // Calculate number of people who purchased an energy drink.
   purchasedInt = (int)purchased;     // Convert the number to an int for approximation.
   preferCitrus = purchased * .64;    // Calculate number of people who prefer citrus.
   preferInt = (int)preferCitrus;     // Convert the number to an int for approximation.
   
   
   // Display in dialog box the results.
   JOptionPane.showMessageDialog(null, "The following results are from a survey conducted by a soft drink company" + 
                                       "\nasking their customers how many energy drinks they purchase per week." + 
                                       "\n\nThe Total number of people surveyed was " + totalSurveyed +
                                       ".\n\nOf those surveyed 64% or approximately " + purchasedInt + " people claimed to purchase 1 or more per week." + 
                                       "\n\nOf those who purchased an energy drink every week, 64% or approximately " + preferInt + " people prefered citrus flavors.");
   
   
   System.exit(0);      // This statement ends the program, is required for JOptionPane.
   
   }


}