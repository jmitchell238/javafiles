/*
 * CISP1020 - Computer Science II
 *
 * Assignment - Chapter 10: #1 Employee and ProductionWorker Classes
 *
 * ProductionWorkerJM.java file
 *
 * Design a class named Employee. The class should keep the following
 * information in fields:
 *
 * • Employee name
 *
 * • Employee number in the format XXX L, where each X is a digit within the
 * range 0 9 and the L is a letter within the range A M.
 *
 * • Hire date
 *
 *
 * Write one or more constructors and the appropriate accessor and mutator
 * methods for the class. Next, write a class named ProductionWorker that
 * extends the Employee class. The ProductionWorker class should have fields to
 *
 * • Shift (an integer)
 *
 * • Hourly pay rate (a double)
 *
 * The workday is divided into two shifts: day and night. The shift field will
 * be an integer value representing the shift that the employee works. The day
 * shift is shift 1 and the night shift is shift 2. Write one or more
 * constructors and the appropriate accessor and mutator methods for the class.
 * Demonstrate the classes by writing a program that uses a ProductionWorker
 * object.
 *
 * Due Date: September 21, 2020
 *
 * Student: James Mitchell Date: 9-20-2020
 *
 */

import java.text.DecimalFormat;

public class ProductionWorkerJM extends EmployeeJM {

    // Constant variables for day and night shift.
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;

    // Employees shift and pay rate variables.
    private int shift;
    private double hourlyPayRate;


    /**
     * Constructor - parameterized. Initializes an object with a name,
     * employee id, hire date, shift, and hourly pay rate.
     *
     * @param n The employees name.
     * @param id The employees Id number.
     * @param date The employees hire date.
     * @param sh The shift the employee works, 1 for day, 2 for night.
     * @param hpr   The Hourly Pay Rate of the employee.
     */
    public ProductionWorkerJM(String n, String id, String date, int sh, double hpr) {
        // Pass n, id, and date variables into the superclass constructor.
        super(n, id, date);

        // Pass sh and hpr variables into the shift and hourlyPayRate variables.
        shift = sh;
        hourlyPayRate = hpr;
    }

    /**
     * Constructor - no args. Initializes an object with null strings for
     * name, employee Id, and hire date. The day shift is selected, and the
     * hourly pay rate is set to 0.0
     */
    public ProductionWorkerJM() {
        // Call the superclass no arg constructor that will pass null
        // strings into the values of variables in superclass.
        super();

        // Set default values for shift and hourlyPayRate.
        shift = DAY_SHIFT;
        hourlyPayRate = 0.0;
    }

    /**
     * setShift method. Sets the shift.
     *
     * @param s The shift number.
     */
    public void setShift(int s) {
        shift = s;
    }

    /**
     * setHourlyPayRate method. Sets the Hourly Pay Rate.
     *
     * @param hpr The Hourly Pay Rate
     */
    public void setHourlyPayRate(double hpr) {
        hourlyPayRate = hpr;
    }

    /**
     * getShift method. Gets the value of the shift field.
     *
     * @return shift
     */
    public int getShift() {
        return shift;
    }

    /**
     * getHourlyPayRate method. Gets the value of the hourlyPayRate
     * field.
     *
     * @return hourlyPayRate
     */
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    /**
     * toString method. This method creates a string that will print
     * out all the information assigned to an object of this class.
     * It also creates a DecimalFormat object in order to convert
     * hourlyPayRate into a format that will print correctly for a
     * monetary value.
     *
     * @return str
     */
    public String toString(){
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        String str = super.toString();

        str += "\nShift: ";
        if (shift == DAY_SHIFT){
            str += "Day";
        } else if (shift == NIGHT_SHIFT){
            str += "Night";
        } else {
            str += "Invalid Shift Number";
        }

        str += ("\nHourly Pay Rate: $" +
                dollar.format(hourlyPayRate));

        return str;
    }
}
