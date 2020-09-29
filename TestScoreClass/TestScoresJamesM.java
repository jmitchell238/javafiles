
/** 
 * Computer Science 1 - James Mitchell - Assigment 6.16
 * April 17, 2020
 * 
 * Test Scores Class
 * 
 * Design a TestScores class that has fields to hold three test scores. 
 * The class should have a constructor, accessor, and mutator methods 
 * for the test score fields, and a method that returns the average of 
 * the test scores. Demonstrate the class by writing a separeate program 
 * that creates an instance of the class. The program should ask the 
 * user to enter three test scores, which are stored in the TestScores 
 * object. Then the program should display the average of the scores, 
 * as reported by the TestScores object.
 * 
 * @author James Mitchell
 * @version 0.1
*/


public class TestScoresJamesM
{
    // Fields
    private double score1;   // Test Score 1
    private double score2;   // Test Score 2
    private double score3;   // Test Score 3
    
    /**
     * Constructor
     * @param tst1 The users first Test Score
     * @param tst2 The users second Test Score
     * @param tst3 The users third Test Score
     */
    
    public TestScoresJamesM(double tst1, double tst2, double tst3)
    {
        score1 = tst1;
        score2 = tst2;
        score3 = tst3;
    }
    
    /**
     * The setScore1 method sets the users First Test Score.
     * @param tst1 The First Test score to store in test1.
     */
    
    public void setScore1(double tst1)
    {
        score1 = tst1;
    }
    
    /**
    * The setScore2 method sets the users Second Test Score.
    * @param tst2 The Second Test score to store in test2.
    */
    
    public void setScore2(double tst2)
    {
        score2 = tst2;
    }
    
    /**
    * The setScore3 method sets the users Third Test Score.
    * @param tst3 The Third Test score to store in test3.
    */
    
    public void setScore3(double tst3)
    {
        score3 = tst3;
    }
    
    /**
    * getScore1 method
    * @return The Users score of Test 1
    */
    
    public double getScore1()
    {
        return score1;
    }
    
    /**
    * getScore2 method
    * @return The Users score of Test 2
    */
    
    public double getScore2()
    {
        return score2;
    }
    
    /**
    * getScore3 method
    * @return The Users score of Test 3
    */
    
    public double getScore3()
    {
        return score3;
    }
    
    /**
    * The getAverage method returns the Test Average
    * of the users 3 entered test scores.
    * @return The Users Average of 3 test scores.
    */
    
    public double getAverage()
    {
       return ( score1 + score2 + score3 ) / 3;         // Sum of Scores Divided by 3
    }
}

