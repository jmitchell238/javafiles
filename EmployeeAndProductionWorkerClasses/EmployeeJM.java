/*
 * CISP1020 - Computer Science II
 *
 * Assignment - Chapter 10: #1 Employee and ProductionWorker Classes
 *
 * EmployeeJM.java file
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
 * Student: James Mitchell Date: 9-19-2020
 *
 */

public class EmployeeJM {

    // Variables.
    private String name;
    private String employeeId;
    private String hireDate;

    /**
     * Constructor - Parameterized This initializes an object with a name, employee
     * id, and hire date.
     *
     * @param n    The Employees Name.
     * @param id   The Employee Number.
     * @param date The date the employee was hired.
     */
    public EmployeeJM(String n, String id, String date) {
        name = n;
        setEmployeeID(id);
        setHireDate(date);
    }

    /**
     * Constructor - No Arg - Overloaded - This initializes an object with null
     * strings for name, employeeId, and hireDate.
     */
    public EmployeeJM() {
        name = "";
        employeeId = "";
        hireDate = "";
    }

    /**
     * setName method sets the employees name.
     *
     * @param n The employees name.
     */

    public void setName(String n) {
        name = n;
    }

    /**
     * setEmployeeId method sets the employees Id.
     *
     * @param id The employees Id Number.
     */

    public void setEmployeeID(String id) {
        // call isValidEmpId method to check that the id
        // passed in is valid. If valid, set as employeeId,
        // if invalid, pass null string into employeeId.
        if (isValidEmpId(id)) {
            employeeId = id;
        } else {
            employeeId = "";
        }
    }

    /**
     * setHireDate method sets the employees hire date.
     *
     * @param date The date the employee was hired.
     */

    public void setHireDate(String date) {
        // call isValidHireDate to check that the Hire Date
        // passed in is valid. If valid, set as hireDate,
        // if invalid, pass null string into hireDate.
        if (isValidHireDate(date)) {
            hireDate = date;
        } else {
            hireDate = "";
        }
    }

    /**
     * getEmployee method.
     *
     * @return The employees name.
     */

    public String getEmployee() {
        return name;
    }

    /**
     * getEmployeeId method.
     *
     * @return The employees ID number.
     */

    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * getHireDate method.
     *
     * @return The employees hire date.
     */

    public String getHireDate() {
        return hireDate;
    }

    /**
     * isValidEmpId method. This method is designed to confirm that
     * the id passed in is in valid format.
     * Example: 123-M
     *
     * @return true / false
     */
    private boolean isValidEmpId(String id) {
        // if statement to make sure that the length of id is 5 characters.
        if (id.length() != 5) {
            return false;
        }

        // Create a char array to convert id into an array.
        char[] idArray = id.toCharArray();

        // for loop that will check the first 3 characters to confirm
        // they are numbers(digits).
        for (int i = 0; i < 3; i++) {
            if (!Character.isDigit(idArray[i])) {
                return false;
            }
        }

        // return statement combined with if statement. These statements
        // checks if the 5th character is a letter between A and M. It also
        // checks that the 4th character is a '-' as required in id format.
        return !(Character.toUpperCase(idArray[4]) < 'A' || Character.toUpperCase(idArray[4]) > 'M'
                || idArray[3] != '-');
        
    }

    /**
     * isValidHireDate method. This method confirms that the date passed in
     * is in the valid format.
     * Example: 01/01/2001
     *
     * @return true / false
     */
    private boolean isValidHireDate(String date) {
        // if statement to check that Date is 10 characters long,
        // that the characters at index 2 and 5 are '/'s are required in format.
        if (date.length() != 10 || date.charAt(2) != '/' || date.charAt(5) != '/') {
            return false;
        }

        // for loop to check that the first 2 characters are numbers.
        for (int i = 0; i < 2; i++) {
            if (!Character.isDigit(date.charAt(i))) {
                return false;
            }
        }

        // for loop to check that the 3rd and 4th index are numbers.
        for (int i = 3; i < 5; i++) {
            if (!Character.isDigit(date.charAt(i))) {
                return false;
            }
        }

        // for loop to check that 6th thru 9th index are numbers.
        for (int i = 6; i < date.length(); i++) {
            if (!Character.isDigit(date.charAt(i))) {
                return false;
            }
        }

        // if none of the above return statemens execute, then date is valid.
        return true;
    }


    /**
     * toString method. This method creates a string that will print
     * out all the variables assigned to an object in this class.
     *
     * @return str
     */
    public String toString(){
        String str = "Name: " + name + "\nEmployee Number: ";

        if (employeeId.equals("")){
            str += "Invalid Employee ID";
        } else {
            str += employeeId;
        }

        str += ("\nHire Date: " + hireDate);

        return str;
    }

}