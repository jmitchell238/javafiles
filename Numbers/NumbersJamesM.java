/** 

Computer Science 1 - James Mitchell - Exam 2 P1

Numbers

(USE for LOOP)

Write a program named NumbersYourName(NumbersJamesM) that will create a .txt file also named 
NumbersYourName(NumbersJamesM.txt) and will write numbers 1 through 10, each number on a separate
line, to that .txt file.  Make certain that an IO exception throws if necessary.
(50 Points)

*/

import java.io.*;  // Needed for File I/O classes


public class NumbersJamesM
{

/**
   The main method is the program's starting point.
*/

   public static void main(String[] args) throws IOException
   {
      
     // Declare Variables 
      int count = 0;
   
     // PrintWriter class to create and open new file
      PrintWriter outputFile = new PrintWriter("NumbersJamesM.txt"); 
      
     // For loop to add 1 to the number each time
      for (count = 1; count <= 10; count++) // Initilize count to 1,
      {                                     // Run until count is more than 10
                                            // After each loop add 1 to count. 
      
         outputFile.println(count); // Output current count number to outputFile
      
      }  
   
     // Close the file 
      outputFile.close();
      
   }

}
