/*
 * CISP1020 - Computer Science II
 *
 * Assignment - Chapter 10: #7 Person and Customer Classes
 *
 * Person and Customer Classes
 *
 * // CustomerJM.java
 *
 * Design a class named Person with fields for holding a person’s name, address,
 * and telephone number. Write one or more constructors and the appropriate
 * mutator and accessor methods for the class’s fields.
 *
 *
 * Next, design a class named Customer, which extends the Person class.
 *
 * The Customer class should have a field for a customer number and a boolean field
 * indicating whether the customer wishes to be on a mailing list.
 *
 * Personal Addition:
 *  Customer ID: Requirements = 5 characters in length. Begins with a letter 'A' - 'Z'
 *                              followed by 4 numbers.
 *
 * Write one or more constructors and the appropriate mutator and accessor methods for the
 * class’s fields.
 *
 * Demonstrate an object of the Customer class in a simple
 * program.
 *
 * Due Date: September 21, 2020
 *
 * Student: James Mitchell Date: 9-20-2020
 */

public class CustomerJM extends PersonJM {

    // Variables
    private String customerNumber;
    private boolean mailingList;

    /**
     * Constructor - Arguments. This constructor will pass arguments into the fields
     * in this class.
     *
     * @param n The persons name.
     * @param addr The personals address.
     * @param ph The persons phone number.
     * @param num The customer ID number.
     * @param list Whether the customer wishes to be on mailing list or not.
     */
    public CustomerJM(String n, String addr, String ph, String num, boolean list){
        // Pass variables into the superclass constructor.
        super(n, addr, ph);

        setCustomerNumber(num);
        setList(list);
    }

    /**
     * Constructor - No Arguments. This constructor will pass null string values
     * into the fields of this class.
     */
    public CustomerJM(){
        // Call superclass No Arg constructor.
        super();
        customerNumber = ""; // Pass null string into customerNumber.
        mailingList = false; // initialize mailingList to default false.
    }

    /**
     * setCustomerNumber method. This method will set the Customers ID number.
     *
     * @param num The Customers ID number.
     */
    public void setCustomerNumber(String num){
        if (isValidCustomerNumber(num)){
            customerNumber = num;
        } else {
            customerNumber = "";
        }
    }

    /**
     * setList method. This method will set the customers wish to be on the mailing
     * list or not.
     *
     * @param list The persons address.
     */
    public void setList(boolean list){
        mailingList = list;
    }

    /**
     * getCustomerNumber method. This method will get the Customers ID number.
     *
     * @return customerNumber The Customers ID number.
     */
    public String getCustomerNumber(){
        return customerNumber;
    }

    /**
     * getList method. This method will get the Customers Mailing list preference.
     *
     * @return list The Customers Mailing List prefernce.
     */
    public boolean getList(){
        return mailingList;
    }


    /**
     * isValidCustomerNumber method. This method is designed to confirm that
     * the Customer ID passed is in valid format.
     * Example: A1234
     *
     * Customer ID: Requirements = 5 characters in length. Begins with a letter 'A' - 'Z'
     *                               followed by 4 numbers.
     *
     * @return true / false
     */
    private boolean isValidCustomerNumber(String num) {

        // Create a char array to convert num into an array.
        char[] numArray = num.toCharArray();

        // if statement to make sure that the length of customer id is 5 characters.
        if (numArray.length != 5) {
            return false;
        }

        // If statement to make sure first character is a letter 'A' - 'Z'.
        if (Character.toUpperCase(numArray[0]) < 'A' || Character.toUpperCase(numArray[0]) > 'Z'){
            return false;
        }

        // for loop that will check the last 4 characters to confirm
        // they are numbers(digits).
         if (!Character.isDigit(numArray[1]) ||
             !Character.isDigit(numArray[2]) ||
             !Character.isDigit(numArray[3]) ||
             !Character.isDigit(numArray[4])) {
            return false;
         }

        // return statement to return true if Customer ID number passed requirements.
        return true;

    }

    /**
     * toString method. This method will construct a string to print out
     * the variables of the object of this class.
     *
     * @return str
     */
    public String toString(){

        String str = super.toString();

        str += "\nCustomers ID: ";

        if (customerNumber.equals("")){
            str += "INVALID CUSTOMER ID";
        } else {
            str += customerNumber;
        }

        str += ("\nMailing List: ");
         if (mailingList){
             str += "Yes";
         } else {
             str += "No";
         }

        return str;
    }
}