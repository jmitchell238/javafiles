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

import java.util.ArrayList; // Import ArrayList to create an array list.

public class GradeBookJamesM {
    
    public static void main(String[] args) 
    {
    	
    	// New GradeBookScoresJamesM called 's' from the class GradeBookScoresJamesM
        GradeBookScoresJamesM s = new GradeBookScoresJamesM();
        
        s.setNames(); // Call setNames 
        
        s.setScores(); // Call setScores
        
        s.getScores(); // Call getScores
        
    }
}
