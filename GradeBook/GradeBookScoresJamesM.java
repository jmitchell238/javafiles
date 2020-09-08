/** 
 * Computer Science 1 - James Mitchell - Exam 3B - Grade Book
 * May 3, 2020
 * 
 * A teacher has five students who have taken four tests. The teacher uses the following grading 
 * scale to assign a letter grade to a student, based on the average of his or her four test scores:
 * 
 * 				Test Score		Letter Grade
 * 				90-100			A
 * 				80-89			B
 * 				70-79			C
 * 				60-69			D
 * 				0-59			F
 * 
 * Write a class that uses a String array or an ArrayList object to hold the five students'
 * names, an array of five characters to hold the five students' letter grades, and five arrays of
 * four doubles each to hold each student's set of test scores. The class should have methods
 * that return a specific student's name, the average test score, and a letter grade based on the
 * average.
 * 
 * Demonstrate the class in a program that allows the user to enter each student's name and
 * his or her four test scores. It should then display each student's average test scores and letter
 * grade.
 * 
 * Input Validation: Do not accept test scores less than zero or greater than 100.
 * 
 * 
 * @author James Mitchell
 * @version 0.1
*/


import java.text.DecimalFormat; // Used to format the Average scores of user
import javax.swing.JOptionPane; // Needed for input and output boxes
import javax.swing.JTextArea;	// Needed for Area for text inside Message Box


class GradeBookScoresJamesM 
{
	
	// Variable Arrays
    private String names[] = new String[5]; // String array for names. 
    private int scores[][]=new int[5][4]; // Int for Scores Array. 5 rows, 4 columns
    private char letterGrade[] = new char[5]; // char Array for letter grades
    
    
    /**
     * The setNames sets the Names for the 5 students
     * 
     */
    public void setNames()
    {
    	// For loop to get names of students from user
        for(int i=0; i<names.length; i++)
        {
        	// Create a name variable to hold input and then place in the names array at the value of i
        	String name = JOptionPane.showInputDialog("Enter a name for student " + (i+1) + ": ");
            names[i]=name;
        }
    }
    
    
    /**
     * The setScores Sets the Scores for each Person
     * 
     */
    public void setScores()
    {
        // For loop to set scores for each Student
        for(int rows=0; rows<5; rows++) // Start int rows at 0, increment each time one students
        {								// scores are done and move to next Student
    
        	// For loop to set scores for each Student
            for(int cols=0; cols<4; cols++)	// Start int cols at 0, increment each iteration until
            {								// all 4 test are inputed
            	
            	String input; // Create a string input for input from user to be parsed
            	
            	// Get and Set score inputed from user to the Scores array of the current iteration
            	// of the first for loops row, and the second for loops col number
            	input = JOptionPane.showInputDialog("Enter "+names[rows]+"'s score for test "+
            														(cols+1)+": ");
                // Parse the input
            	scores[rows][cols] = Integer.parseInt(input); 
            	
            	
            	// While loop to validate user input is between 0-100
            	while( scores[rows][cols] < 0 || scores[rows][cols] > 100)
            	{
            		
            		// Ask user for score again but add VALID
                	input = JOptionPane.showInputDialog("Enter a VALID score for " + names[rows] + 
                										"'s score for test " + (cols+1) + ": ");
                    // Parse the input
                	scores[rows][cols] = Integer.parseInt(input);
                	
            	}
            }
        }
    }
    
    
    /**
     * The getScores gets the scores entered for each user
     * and calculates the average and letter grade and outputs
     * to a message box.
     */
    public void getScores()
    {
    	// Create new instance of DecimalFormat called formatter
        DecimalFormat formatter = new DecimalFormat("###.##"); 
        
		String message = ""; // Create a String called message to hold the information
        					// to display in Message Box at end  for loop
        
        // For loop to perform nested actions for each of the 5 students entered
        for(int rows=0; rows<5; rows++)
        {
        	
            double total=0; // Create a double variable called total and initialize to 0
            
            // For loop to get total of scores for each student
            for(int col=0; col<4; col++)
            {
                total+=scores[rows][col]; // Add all 4 scores for the current student
            }
            
            
            double average=total/4; // Create a double variable called average
            						// The Average is the total calculated previously
            						// divided by 4 which is the number of test entered
            
            //  If/else/if statement to determine students Letter Grade
            if(average>=90) // If their average is greater than or equal to 90
            {				
                letterGrade[rows]='A'; // They get an A
                
            }else if(average>=80) // If their average is greater than or equal to 80
            {
                letterGrade[rows]='B'; // They get an B
                
            }else if(average>=70) // If their average is greater than or equal to 70
            {
                letterGrade[rows]='C'; // They get an C
                
            }else if(average>=60) // If their average is greater than or equal to 60
            {
                letterGrade[rows]='D'; // They get an D
                
            }else // If their average is 59 or less which is all that would be left
            {
                letterGrade[rows]='F'; // They get an F
            }
            
            // Add/concat the information to the message string created that will be output
            // with the JTextArea after the for loop is complete
            message += names[rows] + "'s average score: \t" + formatter.format(average) + 
            		   "%" + "\t(" + letterGrade[rows] + ")" + "\n";

        }
        
        // Show Message Box with Student names and average and letter grade 
        
	    JOptionPane.showMessageDialog(null, new JTextArea(message));
	    
    }
}