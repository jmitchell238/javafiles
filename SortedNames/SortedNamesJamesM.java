/**
Computer Science 1 - James Mitchell - Assigment 3: Extra credit


Extra Credit Project.   

*/

import javax.swing.JOptionPane;     // This is needed to display dialog boxes
public class SortedNamesJamesM


{

   /**
      The main method is the program's starting point
   */
   
   public static void main(String[] args)
   {
      String first, second, third;     // This declares String variables for the program
            
      first = JOptionPane.showInputDialog("Enter the first name: ");       // Request user input for first name
      second = JOptionPane.showInputDialog("Enter the second name: ");     // Request user input for second name
      third = JOptionPane.showInputDialog("Enter the third name: ");       // Request user input for third name
      
      // If statement to begin process or Sorting the names in alphabetical order
      
      if (first.compareTo(second) < 0 && first.compareTo(third) < 0)       // If First name comes before second name 
          {                                                                // If First name comes before third name
                                                                           // then continue to next statement
          
          if (second.compareTo(third) < 0)                                 // If second name comes before third name continue
           {      
                JOptionPane.showMessageDialog (null, "Names in ascending order: \n"    // Output to message box
                                           + first + "\n" + second + "\n" + third);    // is the names are already
             }                                                                         // in alphabetical order
              else
              {
                JOptionPane.showMessageDialog (null, "Names in ascending order: \n"    // Else, if third name comes before
                                           + first + "\n" + third + "\n" + second);    // second name, output this result
              }
            }
         else if  (second.compareTo(first) <0 && second.compareTo(third) < 0) // If second name comes before first name and
                                                                              // second name comes before third name then continue
            {
              if (first.compareTo(third) < 0)                                 
               {
              JOptionPane.showMessageDialog (null, "Names in ascending order: \n"   // If first name then comes before third then output this
                                           + second + "\n" + first + "\n" + third); // dialog box
                }
               else                                                                 
                {
                JOptionPane.showMessageDialog (null, "Names in ascending order: \n" // Else if Third name comes before First then output this
                                           + second + "\n" + third + "\n" + first); // dialog box
                }
              }
          else 
             {
               if (second.compareTo(first)< 0)                                      // Last Else, Compare second name to first name
                {
                
                 JOptionPane.showMessageDialog (null, "Names in ascending order: \n"   // If second name comes before first name but after third name
                                           + third + "\n" + second + "\n" + first);    // then output this dialog box
                }
               else
                {
               JOptionPane.showMessageDialog (null, "Names in ascending order: \n"     // If first name comes before second name but after third name
                                          + third + "\n" + first + "\n" + second);     // then output this dialog box
                 }
              }

          System.exit(0);      // This statement ends the program, it is supposed to be required due to JOptionPane.
     
          }
      }




              
                                          

                                          
            