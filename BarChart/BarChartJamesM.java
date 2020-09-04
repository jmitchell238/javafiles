/** 

Computer Science 1 - James Mitchell - Assigment 4:12

Bar Chart

Write a program that ask the user to enter today's sales for five stores. The program should
display a bar chart comparring each store's sales. Create each bar in the bar chart by displaying
a row of asterisks. Each asterisk should represent $100 of sales. Here is the example of the
program's output.

Enter today's sales for store 1: 1000 [Enter]
Enter today's sales for store 2: 1200 [Enter]
Enter today's sales for store 3: 1800 [Enter]
Enter today's sales for store 4: 800 [Enter]
Enter today's sales for store 5: 1900 [Enter]

SALES BAR CHART
Store 1:**********
Store 2:************
Store 3:******************
Store 4:********
Store 5:*******************

*/


import javax.swing.JOptionPane;  // This is needed to display dialog boxes.

public class BarChartJamesM
{

/**
   The main method is the program's starting point.
*/
   public static void main(String[] args)
   {
   
    // Declare Variables for Program.     
      String inputString;  // String for User Input.
      double storeSales;   // Double to hold the sales number user inputs.
      int numOfStores = 5, numOfHundredDivisions = 0; // Integers for number of Stores
                                                      // and number of divisions for 
                                                      // asterisks.
   
    // StringBuilder for building output string to display in Message Box.
      StringBuilder output = new StringBuilder("SALES BAR CHART\n");
   
   
    // for loop to perform calculations and display bar chart .
      for(int store = 1; store <= numOfStores; store++) // Initialize store, compare store to
      {                                                 // number of stores, add 1 to store.
        // Request sales number for store from the user.
         inputString = JOptionPane.showInputDialog("Enter today's sales for store " + store);
        // Store the number entered into the storeSales variable. 
         storeSales = Double.parseDouble(inputString);
        // Divide that number by 100 to find how many Asterisks there need to be. 
         numOfHundredDivisions = (int)(storeSales / 100);
        // Add this Store and it's number to the String created with StringBuilder. 
         output.append("Store " + store + ": ");
         
        // for loop to create each asterisk for bar chart.
         for(int asterisk = 1; asterisk <= numOfHundredDivisions; asterisk++)
         {
           // Output an Asterisk to String until the variable asterisk is equal to numOfHundredDivisions. 
            output.append("*");      
         } 
          
     // This will add a new line to the output String so that the next store can be added. 
      output.append("\n");
      
            // After these asterisk have been added to output String, then it will go back up to the origional
            // for loop to perform the same operations for the next store until it equals the number of stores
            // set in the numOfStores variable. For origional program this number is set to 5, so the for loop
            // will do this for 5 stores.
      }
      
     // Output Message Dialog Box with Bar Chart .
      JOptionPane.showMessageDialog(null, output);
   
     // This statement ends the program, is required for JOptionPane.
      System.exit(0);  
   }
}
