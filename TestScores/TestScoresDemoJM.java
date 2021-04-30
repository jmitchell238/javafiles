/*

CISP1020 - Computer Science II

Assignment - Chapter 11: #1 TestScores Class

TestScoresDemoJM.java file

Write a class named TestScores. The class constructor should accept an array of test scores
as its argument. The class should have a method that returns the average of the test scores.
If any test score in the array is negative or greater than 100, the class should throw an IllegalArgumentException.
Demonstrate the class in a program.

Due Date: October 14, 2020

Student: James Mitchell
Date: October 14, 2020

*/

public class TestScoresDemoJM {

    public static void main(String[] args) {

        // Test Scores Array
        int[] testScores = {100,99,98,97,96,95,94,93,92,91,90}; // 10 scores

        // Create a TestScoresJM object
        TestScoresJM tests = new TestScoresJM(testScores);

        // Get Average
        // If a score > 100 or < 0 is in array an "IllegalArgumentException" will be thrown.
        System.out.println(tests.getAverage());

    }

}