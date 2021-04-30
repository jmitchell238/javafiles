/*
 * CISP1020 - Computer Science II
 *
 * Assignment - Chapter 10: #7 Person and Customer Classes
 *
 * Person and Customer Classes
 *
 * // PersonJM.java
 *
 * Design a class named Person with fields for holding a person’s name, address,
 * and telephone number. Write one or more constructors and the appropriate
 * mutator and accessor methods for the class’s fields.
 *
 * Personal Addition:
 *  Phone Number: Requirements = 12 characters in length.
 *                              Characters index 0-2, 4-6, 8-11 must be numbers.
 *                              Characters index 3, 7must be '-'.
 *                              Example: 123-123-1234.
 *
 * Next, design a class named Customer, which extends the Person class.
 *
 * The Customer class should have a field for a customer number and a boolean field
 * indicating whether the customer wishes to be on a mailing list.
 *
 * Write one or more constructors and the appropriate mutator and accessor methods for the
 * class’s fields.
 *
 * Demonstrate an object of the Customer class in a simple
 * program.
 *
 * Due Date: September 21, 2020
 *
 * Student: James Mitchell Date: 9-19-2020
 */

public class PersonJM {

    // Variables.
    private String name;
    private String address;
    private String phone;

    /**
     * Constructor - Arguments. This constructor will pass arguments into the fields
     * in this class.
     *
     * @param n The persons name.
     * @param addr The personals address.
     * @param ph The persons phone number.
     */
    public PersonJM(String n, String addr, String ph){
        name = n;
        setAddress(addr);
        setPhone(ph);
    }

    /**
     * Constructor - No Arguments. This constructor will pass null string values
     * into the fields of this class.
     */
    public PersonJM(){
        name = "";
        address = "";
        phone = "";
    }

    /**
     * setName method. This method will set the persons name.
     *
     * @param n The persons name.
     */
    public void setName(String n){
        name = n;
    }

    /**
     * setAddress method. This method will set the persons address.
     *
     * @param addr The persons address.
     */
    public void setAddress(String addr){
        address = addr;
    }

    /**
     * setPhone method. This method will set the persons phone number.
     *
     * @param ph The persons phone number.
     */
    public void setPhone(String ph){
        // call isvalidPhone() method to validate phone number.
        // if valid, set phone number, if invalid, pass null string.
        if(isValidPhone(ph)){
            phone = ph;
        } else {
            phone = "";
        }
    }

    /**
     * getName method. This method will get the persons name.
     *
     * @return name The persons name.
     */
    public String getName(){
        return name;
    }

    /**
     * getAddress method. This method will get the persons address.
     *
     * @return adderss The persons address.
     */
    public String getAddress(){
        return address;
    }

    /**
     * getPhone method. This method will get the persons phone number.
     *
     * @return phone The persons phone number.
     */
    public String getPhone(){
        return phone;
    }

    /**
     * isValidPhone method. This method is designed to confirm that
     * the phone number passed is in valid format.
     * Example: 123-123-1234
     *
     * @return true / false
     */
    private boolean isValidPhone(String ph) {
        // if statement to make sure that the length of phone is 12 characters.
        if (ph.length() != 12) {
            return false;
        }

        // Create a char array to convert ph into an array.
        char[] phArray = ph.toCharArray();

        // for loop that will check the first 3 characters to confirm
        // they are numbers(digits).
        for (int i = 0; i < 3; i++) {
            if (!Character.isDigit(phArray[i])) {
                return false;
            }
        }

        // for loop that will check the next 3 characters to confirm
        // they are numbers(digits).
        for (int i = 4; i < 7; i++) {
            if (!Character.isDigit(phArray[i])) {
                return false;
            }
        }

        // for loop that will check the last 4 characters to confirm
        // they are numbers(digits).
        for (int i = 9; i < phArray.length; i++) {
            if (!Character.isDigit(phArray[i])) {
                return false;
            }
        }


        // return statement combined with if statement. These statements
        // checks if the 3rd and 7th index character is a '-' as required in format.
        return !(phArray[3] != '-' || phArray[7] != '-');

    }

    /**
     * toString method. This method will construct a string to print out
     * the variables of the object of this class.
     *
     * @return str
     */
    public String toString(){
        String str = "Name: " + name + "\nAddress: ";

        if (address.equals("")){
            str += "Address N/A";
        } else {
            str += address;
        }

        str += ("\nPhone Number: ");
        if (phone.equals("")){
            str += "INVALID PHONE NUMBER";
        } else {
            str += phone;
        }

        return str;
    }
}