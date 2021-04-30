/*

CISP1020 - Computer Science II

Assignment - Chapter 11: #1 TestScores Class

TestScoresJM.java file

Write a class named TestScores. The class constructor should accept an array of test scores
as its argument. The class should have a method that returns the average of the test scores.
If any test score in the array is negative or greater than 100, the class should throw an IllegalArgumentException.
Demonstrate the class in a program.

Due Date: October 14, 2020

Student: James Mitchell
Date: October 14, 2020

*/

public class TestScoresJM {

    // Variables
    private int[] testScores;
    private int average = 0;

    /**
     * Constructor - argument. This constructor will pass the testScores array
     * into this class.
     *
     * @param testScores The array of testScores
     */
    public TestScoresJM(int[] testScores) {
        // Set testScores array field in this class.
        this.testScores = testScores;

    }

    /**
     * getAverage Method. Returns the average of the test scores in the array.
     * @return average The average of the Test Scores.
     */
    public int getAverage() {

        // Create variables for sum and length of array.
        double sum = 0;
        double length = testScores.length;

        // for loop to go through each number in the testScores array.
        for(int n: testScores) {

            // if statement to throw exception if a number is > 100 or < 0.
            if(n < 0 || n > 100) {
                throw new IllegalArgumentException("One or more of the Test Scores is Less than 0 or Greater than 100");
            }

            // Add the number to the sum if it's valid.
            sum+= (double)n;
        }

        // return an integer, use Math.round() to round the sum up.
        return (int)Math.round(sum / length);
    }


}
