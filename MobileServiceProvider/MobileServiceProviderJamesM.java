/** 

Computer Science 1 - James Mitchell - Assigment 3:13

Mobile Service Provider

A mobile phone service provider has three different subscription packages for its customers.

Package A: For $39.99 per month, 450 minutes are provided. Additional minutes are $0.45 per minute.

Package B: For $59.99 per month, 900 minutes are provided. Additional minutes are $0.40 per minute.

Package C: For $69.99 per month, unlimited minutes are provided.

Write a program that calculates a customer's monthly bill. It should ask the user to enter 
the letter of the package the customer has purchased (A, B, or C) and the number of minutes 
that were used. The program should display the total charges.


*/

import javax.swing.JOptionPane;  // This is needed to display dialog boxes.

public class MobileServiceProviderJamesM
{

   /**
      The main method is the program's starting point.
   */
   
   public static void main(String[] args)
   {
   
       // Declare Variables for Program.
   
      String userInputPackage,   // For reading Users Inputed Package
             userInputUsed;
      
      final double packageAprice = 39.99,    // Package A Base Price
                   packageBprice = 59.99,    // Package B Base Price
                   packageCprice = 69.99,    // Package C Base Price
                   packageAover = 0.45,      // Package A Overage fee
                   packageBover = 0.40;      // Package B Overage fee
                   
      double       extraCharge = 0,          // Extra Charge for Overage
                   userInputMinutes = 0,     // Minutes the user used
                   minutesOver = 0,          // Minutes Exceeded
                   totalBill = 0;            // Users Total Bill
                   
      final int packageAminutes = 450,       // Package A minutes allowed
                packageBminutes = 900;       // Package B minutes allowed    
   
   
      userInputPackage = JOptionPane.showInputDialog("What package do you have?");  
      
      userInputUsed = JOptionPane.showInputDialog("How many minutes did you use?");  
      userInputMinutes = Double.parseDouble(userInputUsed);    // Convert the user input to a double
        
      // If Statement to determine what Package the user has and how many minutes over they were
      // in order to calculate their total bill they owe.
   
   
      // User Enters Option A
      if( userInputPackage.equalsIgnoreCase("a") )
        {
         if( userInputMinutes > packageAminutes )
           {
               minutesOver = userInputMinutes - packageAminutes;
               extraCharge = minutesOver * packageAover;  
           } 
           totalBill = packageAprice + extraCharge; 
           
           JOptionPane.showMessageDialog(null, "Your Package:              " + userInputPackage +  // Display results in a Message Box.
                                       "\nMinutes Exceeded:     " + minutesOver +
                                       "\nExtra Charge:               $" + extraCharge +
                                       "\nTotal Charge:                $" + totalBill );              
      }
      
      
      // User Enters Option B
      else if( userInputPackage.equalsIgnoreCase("b") )
         {
         if( userInputMinutes > packageBminutes )
            {
               minutesOver = userInputMinutes - packageBminutes;
               extraCharge = minutesOver * packageBover;  
            }
            totalBill = packageBprice + extraCharge;  
            
            JOptionPane.showMessageDialog(null, "Your Package:              " + userInputPackage +  // Display results in a Message Box.
                                       "\nMinutes Exceeded:     " + minutesOver +
                                       "\nExtra Charge:               $" + extraCharge +
                                       "\nTotal Charge:                $" + totalBill );  
         }
         


      // User Enters Option C
      else if ( userInputPackage.equalsIgnoreCase("c") )
         {
           totalBill = packageCprice;
           
           JOptionPane.showMessageDialog(null, "Your Package:              " + userInputPackage +  // Display results in a Message Box.
                                       "\nMinutes Exceeded:     " + minutesOver +
                                       "\nExtra Charge:               $" + extraCharge +
                                       "\nTotal Charge:                $" + totalBill );               
         }
   
         
       // User Enters anything other than A, B, or C
       else
         {
            JOptionPane.showMessageDialog(null, "You Entered an Invalid Package. \nPlease Enter A, B, or C. \nThank You!" );              
         }
   
      
      
      System.exit(0);      // This statement ends the program, is required for JOptionPane.
      
      }
   }
