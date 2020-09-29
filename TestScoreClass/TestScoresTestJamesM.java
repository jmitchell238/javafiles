import javax.swing.JOptionPane;

/**
 * Computer Science 1 - James Mitchell - Assigment 6.16
 * April 17, 2020
 * 
 * This program is to test the TestScores Class
 * and to return an Average of the user entered scores.
 * 
 * @author James Mitchell
 * @version 0.1
 */

public class TestScoresTestJamesM
{
    public static void main(String[] args)
    {
        double tst1 = 0;        // To hold Test Score 1
        double tst2 = 0;        // To hold Test Score 2
        double tst3 = 0;        // To hold Test Score 3
        double average = 0;     // The average of the scores entered   
        String input;       // To hold user input
        
        // Create three TestScores objects.
        TestScoresJamesM score = new TestScoresJamesM(tst1, tst2, tst3);
        
        // Get and store Test Score1.
        input = JOptionPane.showInputDialog("What is your 1st Test Score?");
        tst1 = Double.parseDouble(input);
        score.setScore1(tst1);
        
        // Get and store Test Score2.
        input = JOptionPane.showInputDialog("What is your 2nd Test Score?");
        tst2 = Double.parseDouble(input);
        score.setScore2(tst2);

        // Get and store Test Score3.
        input = JOptionPane.showInputDialog("What is your 3rd Test Score?");
        tst3 = Double.parseDouble(input);
        score.setScore3(tst3);
        
        // Calculate the Average of the Users 3 Test Scores.
        average = score.getAverage();
        
        // Display the total Average
        JOptionPane.showMessageDialog(null, "Test Score 1:   " + tst1 +
                                          "\nTest Score 2:   " + tst2 +
                                          "\nTest Score 3:   " + tst3 +
                                          "\n                            -----" +
                                          "\nAverage:          " + average);
                                        
        System.exit(0);
    }
}
