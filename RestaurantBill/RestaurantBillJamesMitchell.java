/** 

Computer Science 1 - James Mitchell - Assigment 2:13

Restaurant Bill Program
This Program computes the tax and tip on a restaurant bill.
The User will enter the charge for their bill. The tax will be 6.75
percent of the meals charge. The tip will be calculated
as 20 percent of the total after adding the tax. The program will
display the Meal charge, Tax Amount, Tip amount, and total bill.

*/

import javax.swing.JOptionPane;  // This is needed to display dialog boxes.

public class RestaurantBillJamesMitchell
{

   /**
      The main method is the program's starting point.
   */
   
   public static void main(String[] args)
   {
   
   // Declare Variables for Program.
   
   Scanner keyboard = new Scanner(System.in);
   
   String inputString;              // For reading input
   
   double mealCost = 0, taxRate = 0.0675, tax = 0, tipRate = 0.2, // Double variables for calculations
          tip = 0, total = 0, totalBill = 0;
   
   
   inputString = JOptionPane.showInputDialog( "Please enter the cost of your meal: ");    // Input Dialog box
   
   mealCost = Double.parseDouble(inputString);           // Convert the user input to a double
   
   // Make calculations needed.
   
   tax = taxRate * mealCost;
   total = mealCost + tax;
   tip = tipRate * total;
   totalBill = tip + total;
      

   
   // Display results in a Message Box.
   
   JOptionPane.showMessageDialog(null, "Cost of Meal: $" + mealCost +
                                       "\nTax: $" + tax +
                                       "\nTip: $" + tip +
                                       "\nTotal Bill: $" + totalBill );
   
   
   System.exit(0);      // This statement ends the program, is required for JOptionPane.
   
   }
}