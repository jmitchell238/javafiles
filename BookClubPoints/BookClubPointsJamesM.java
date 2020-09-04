/** 

Computer Science 1 - James Mitchell - Assigment 3:16

Book Club Points

Serendipity Booksellers has a book club that awards points to its customers based on the
number of books purchased each month. The points are awared as follows.

If a customer purchases 0 books, he or she earns 0 points.
If a customer purchases 1 books, he or she earns 5 points.
If a customer purchases 2 books, he or she earns 15 points.
If a customer purchases 3 books, he or she earns 30 points.
If a customer purchases 4 books, he or she earns 60 points.

Write a program that asks the user to enter the nuymber of books that he or she has 
purchased this month and then displays the number of points awarded.


*/


import javax.swing.JOptionPane;  // This is needed to display dialog boxes.

public class BookClubPointsJamesM
{

   /**
      The main method is the program's starting point.
   */
   
   public static void main(String[] args)
   {
   
   // Declare Variables for Program.
   String userBooksPurchased;    // String for User Entered number of books
   
   
   int booksPurchased = 0,       // Amount of books purchased
       userPoints = 0;           // Amount of points earned
       
       
   // Perform a Try to make sure the user enters a valid Integer.
   
   try 
   {  
   
      userBooksPurchased = JOptionPane.showInputDialog("How many books did you purchase this month?");
      booksPurchased = Integer.parseInt(userBooksPurchased.trim());
   
   // If statement to determine if the user Entered a proper value.
   
   if ( booksPurchased < 0)      // If the user Purchased Less than 0 books, ask them for valid value.
      {
         JOptionPane.showMessageDialog(null, "Number of books purchased can't be less than 0.\nPlease enter 0 or higher." );
      }
      
   else   // If the user entered an valid integer then perform this Switch statement.
      {
               
         // Switch statement to determine the amount of points the user received this month.
         switch ( booksPurchased )
            {
               case 0:              // for No books purchased
                  userPoints = 0;
                  break;
               case 1:              // For 1 book
                  userPoints = 5;
                  break;
               case 2:              // For 2 Books
                  userPoints = 15;
                  break;
               case 3:              // For 3 books
                  userPoints = 30;
                  break;
               default:             // For 4 books or more
                  userPoints = 60;
                  break;            // Not necessary but still going to use it.
            }   

   
      
         // Display to user the amount of points earned in a Message Box.
   
         JOptionPane.showMessageDialog(null, "You purchased " + booksPurchased + " books this month.\n" +
                                       "\nYou have earned " + userPoints + " points.\n" );
   
   
       }
      }
      
   // If the user didn't enter a valid Integer then the Catch will inform them they need to enter valid value   
   catch (NumberFormatException nfe)
      {
         JOptionPane.showMessageDialog(null, "Please enter a valid number." );            
      }
      
    System.exit(0);      // This statement ends the program, is required for JOptionPane.
   }
}
