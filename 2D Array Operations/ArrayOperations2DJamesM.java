
/** 
 * Computer Science 1 - James Mitchell - Assigment 7.17(pg 491)
 * April 29, 2020
 * 
 * Write a program that creates a two-dimensional array initialized with test data. 
 * Use any primitive data type you wish. The program should have the following methods.
 * 
 * getTotal - This method should accept a two-dimensional array as its argument and 
 *              return the total of all the values in the array.
 * getAverage - This method should accept a two-dimensional array as its argument and 
 *              return the average of all the values in the array.
 * getRowTotal. - This method should accept a two-dimensional array as its first 
 *              argument and an integer as its second argument. The second argument 
 *              should be the subscript of a row in the array. The method should return 
 *              the total of the values in the specified row.
 * getColumnTotal - This method should accept a two-dimensional array as its First 
 *              argument and an integer as its second argument. The second argument 
 *              should be the subscript of a column in the array. The method should 
 *              return the total of the values in the specified column.
 * getHighestInRow - This method should accept a two-dimensional array as its First 
 *              argument and an integer as its second argument. The second argument 
 *              should be the subscript of a row in the array. The method should return 
 *              the Highest values in the specified row in the array.
 * getLowestInRow - This method should accept a two-dimensional array as its First 
 *              argument and an integer as its second argument. The second argument 
 *              should be the subscript of a row in the array. The method should return the lowest values in the specified row in the array.
 * 
 * Demonstrate each of the methods in this program.
 * 
 * @author James Mitchell
 * @version 0.1
*/


public class ArrayOperations2DJamesM
{
        
    /* 
     * getTotal Method
     *  This method gets the total of all the values in the array. It has two for loops
     *  The first for loop starts on row 0
     *      The second for loop is nested and starts on column 0
     *      This adds the value in the column and row number to total and then moves to the 
     *      next. It will move through each index in the column until their are no more, then
     *      it will go back to the first for loop and move to the next row to start the 
     *      process over again. Each time adding to the total and then returning that total to
     *      the main method.
     */ 
    
    public static double getTotal(double[][] array) {
        double total = 0;
    
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total += array[row][col];
            }
        }
    
        return total;
    }
    
    /*
     * getAverage Method
     *  This method will call the getTotal method and pass the array into it.
     *  It will then divide that by the getElementCount method with the array passed into it.
     *  It returns the result of that calculation.
     */
    
    public static double getAverage(double[][] array) {
        return getTotal(array) / getElementCount(array);
    }
    
    /* 
     * getRowTotal Method
     *  This method receives the array into it, and a row number into it. It then uses
     *  a for loop to add up every item in every column of that row inputed into it.
     *  It then returns the total.
     */
    
    public static double getRowTotal(double[][] array, int row) {
        double total = 0;
    
        for (int col = 0; col < array[row].length; col++) {
            total += array[row][col];
        }
    
        return total;
    }
    
    /*
     * getColumnTotal Method *  
     * This method receives the array into it, and a column number into it. It then uses
     * a for loop to add up every item in every row of that column inputed into it.
     * It then returns the total.
     */
    
    public static double getColumnTotal(double[][] array, int col) {
        double total = 0;
    
        for (int row = 0; row < array.length; row++) {
            total += array[row][col];
        }
    
        return total;
    }
    
    /*
     * getHighestInRow Method
     *  This method brings in the array and a row number.
     *  it then initializes the Row number brought in at column 0 as the highest. It then 
     *  runs a for loop to check every other item in that row and if it's higher than 
     *  the initial one, then it sets it as the highest and returns that number.
     */
    
    public static double getHighestInRow(double[][] array, int row) {
        double highest = array[row][0];
    
        for (int col = 1; col < array[row].length; col++) {
            if (array[row][col] > highest) {
                highest = array[row][col];
            }
        }
        return highest;
    }
    
    /*
     * getLowestInRow Method
     *  This method brings in the array and a row number.
     *  it then initializes the Row number brought in at column 0 as the lowest. It then 
     *  runs a for loop to check every other item in that row and if it's lower than 
     *  the initial one, then it sets it as the lowest and returns that number.
     */
    
    public static double getLowestInRow(double[][] array, int row) {
        double lowest = array[row][0];
    
        for (int col = 1; col < array[row].length; col++) {
            if (array[row][col] < lowest) {
                lowest = array[row][col];
            }
        }
        return lowest;
    }
    
    /*
     * getElementCount Method
     *  This method determines the total number of items in the array.
     *  It does this by receiving the array in initially.
     *  It then initializes a count to 0 and then starts a for loop.
     *  The for loop starts at row 0. It then takes the length of the row, which is how many 
     *  indexes are in that row and it adds it to the count. Then it moves to the next row and 
     *  adds that to the count, effectivly adding up to the total number of items located in 
     *  the array.
     */
    
    public static int getElementCount(double[][] array) {
        int count = 0;
    
        for (int row = 0; row < array.length; row++) {
            count += array[row].length;
        }
        return count;
    }
    
    /*
     * Main Method to run program
     */
    
    public static void main(String[] args) {
        // Declare Variables / arrays
        double[][] studentTestScores = { { 99, 100, 97.5, 99.5 },  // Double 2D Array
                                         { 89, 97, 99, 95 },       // for studentTestScores
                                         { 93, 99, 94, 100 } };    // with 3 rows, 4 columns
    
        // Process the double array.
        System.out.println("Total : " + getTotal(studentTestScores)); // Print Total of scores
        System.out.println("Average : " + getAverage(studentTestScores) + "\n"); // Print Average
    
        System.out.println("Total of row 1 : "
                + getRowTotal(studentTestScores, 0));   // Print Total of row 1 (index 0)
        System.out.println("Total of row 2 : "
                + getRowTotal(studentTestScores, 1));   // Print Total of row 2 (index 1)
        System.out.println("Total of row 3 : "
                + getRowTotal(studentTestScores, 2) + "\n");    // Print Total of row 3 (index 2)
    
        System.out.println("Total of col 1 : "
                + getColumnTotal(studentTestScores, 0)); // Print total of column 1 (index 0)
        System.out.println("Total of col 2 : "
                + getColumnTotal(studentTestScores, 1));    // Print total of column 2 (index 1)
        System.out.println("Total of col 3 : "
                + getColumnTotal(studentTestScores, 2));   // Print total of column 3 (index 2)     
        System.out.println("Total of col 4 : "
                + getColumnTotal(studentTestScores, 3) + "\n");// Print total of column 4 (index 3)
    
        System.out.println("Highest in row 1 : "
                + getHighestInRow(studentTestScores, 0)); // Print Highest in row 1 (index 0)
        System.out.println("Highest in row 2 : "
                + getHighestInRow(studentTestScores, 1));   // Print Highest in row 2 (index 1)
        System.out.println("Highest in row 3 : "
                + getHighestInRow(studentTestScores, 2) + "\n");    // Print Highest in row 3 (index 2)
                
        System.out.println("Lowest in row 1 : "
                + getLowestInRow(studentTestScores, 0));    // Print Lowest in row 1 (index 0)
        System.out.println("Lowest in row 2 : "
                + getLowestInRow(studentTestScores, 1));    // Print Lowest in row 2 (index 1)
        System.out.println("Lowest in row 3 : "
                + getLowestInRow(studentTestScores, 2) + "\n"); // Print Lowest in row 3 (index 2)      
    
    }
}

