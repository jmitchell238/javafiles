/** 

Computer Science 1 - James Mitchell - Assigment 4:3

Distance File

Modify the program you wrote for Programming Challenge 2 (Distance Traveled) so it 
writes the report to a file instead of the screen. Open the file in Notepad or another
text editor to confirm the output.

*/

import java.io.*;  // Needed for File I/O classes

import java.util.Scanner; // This is needed for Scanner Class input from keyboard.

public class DistanceFileJamesM
{


/**
   Function to convert String to integer for MPH 
*/
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
    
/**
   Function to convert String to integer for Hours traveled
*/
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

   public static void main(String[] args) throws IOException
   {
   
     // Declare Variables for the Program
      String input, filename;     // To hold user input
      int mph = 0, hours = 0, distance = 0, count=1;     // To hold data inputed and calculated
      
     // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in); 
      
     // Ask user for Input of Filename to be created.
      System.out.println("What would you like to name your output file?"); // Ask user
      filename = keyboard.nextLine();  // Place User input into filename String
      
     // Consume the remaining newline character.
      keyboard.nextLine();
      
     // Create File
      File file = new File(filename + ".txt");
      
     // Open the file.
      PrintWriter outputFile = new PrintWriter(file);
      
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
     
      outputFile.println("\t" +"Hour" + "\t\t" + "Distance Traveled(Miles)");  // Output headers to file
     
     // Perform a While loop to show distance traveled each hour and output to screen.
      while (count <= hours)
      {
         distance = count * mph; // Formula to calculate distance.
         outputFile.println("\t" + count + "\t\t\t\t\t" + distance); // Output a line to screen
         count++;    // Add one to the current loop count
      }
   
     // Close the file.
      outputFile.close();
      System.out.println("Data has been written to a file");
   
   }
}
