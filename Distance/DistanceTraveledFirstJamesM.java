/** 

Computer Science 1 - James Mitchell - Assigment 4:2

Distance Traveled

The distance a vehicle travles can be calculated as follows:
   Distance = Speed * Time
   
For Example, if a train travels 40 miles-per-hour for three hours, the distance traveled is
120 miles. Write a program that ask for the speed of a vehicle (in miles-per-hour) and the
number of hours it has traveled. It should use a loop to display the distance a vehicle has
traveled for each hour of a time period specified by the user, if a vehicle is traveling at
40 mph for a three-hour time period, it should display a report similar to the one that follows.

Hour     Distance Traveled
1              40
2              80
3              120

Input Validation: Do not accept a negative number for speed and do not accept any value less than 1
for time traveled.

*/


import java.util.Scanner; // This is needed for Scanner Class input from keyboard.

public class DistanceTraveledFirstJamesM
{


// Function to convert String to integer for MPH 
    public static int convertMph(String input) 
    { 
        int mph = 0; 
  
        // Convert the String 
        try { 
            mph = Integer.parseInt(input); 
        } 
        catch (NumberFormatException e) { 
  
            // This is thrown when the String 
            // contains characters other than digits 
            System.out.println("Invalid Input, Please enter a valid Integer for speed."); 
        } 
        return mph; 
    } 
    
// Function to convert String to integer for Hours traveled
    public static int convertHours(String input) 
    { 
        int hours = 0; 
  
        // Convert the String 
        try { 
            hours = Integer.parseInt(input); 
        } 
        catch (NumberFormatException e) { 
  
            // This is thrown when the String 
            // contains characters other than digits 
            System.out.println("Invalid Input, Please enter a valid Integer for hours."); 
        } 
        return hours; 
    } 




/**
 The main method is the program's starting point.
*/

   public static void main(String[] args)
   {
   
     // Declare Variables for the Program
      String input;     // To hold user input
      int mph = 0, hours = 0, distance = 0, count=1;     // To hold data inputed and calculated
      
     // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in); 
      
     // Ask user for Input of Speed traveling
      System.out.println("What was the speed of your vehicle?");
      
     // Validate that Input for speed is an Integer
      while (mph == 0)
      { 
         input = keyboard.nextLine();  // Get user input
         mph = convertMph(input);   // Call the convertMph Function
      }
      
      
     // Validate the input of Speed traveling
      while (mph <= 0)
      {
         System.out.println("Speed can not be a Negative number.");  // Inform user that they
                                                                     // can't input negative number
         input = keyboard.nextLine();  // Get user input
         mph = convertMph(input);   // Call the convertMph Function
      }
      
      
     // Ask user for Input of Hours Traveling     
      System.out.println("How many hours did the vehicle travel?");
      
     // Validate the input of Hours in an Integer
      while (hours == 0)
      { 
         input = keyboard.nextLine();  // Get user input 
         hours = convertHours(input);  // Call the convertHours Function
      } 
   

        // Validate the input of Hours Traveling is 1 or above
         while (hours < 1)
         {
            System.out.println("Hours traveled must be 1 hour or more.");  // Inform use that hours
                                                                           // must be 1 or more
            input = keyboard.nextLine();  // Get user input
            hours = convertHours(input);  // Call the convertHours Function
         }
         
   
   
     // Output to user with Information about hours and distance traveled
     
     System.out.println("\t" +"Hour" + "\t\t" + "Distance Traveled(Miles)");  // Output headers
     
     // Perform a While loop to show distance traveled each hour and output to screen.
      while (count <= hours)
      {
         distance = count * mph; // Formula to calculate distance.
         System.out.println("\t" + count + "\t\t\t\t\t" + distance); // Output a line to screen
         count++;    // Add one to the current loop count
      }
   
   
   }
}
