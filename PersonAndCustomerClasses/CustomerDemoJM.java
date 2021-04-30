/*
 * CISP1020 - Computer Science II
 *
 * Assignment - Chapter 10: #7 Person and Customer Classes
 *
 * Person and Customer Classes
 *
 * // CustomerDemoJM.java
 *
 * Design a class named Person with fields for holding a person’s name, address,
 * and telephone number. Write one or more constructors and the appropriate
 * mutator and accessor methods for the class’s fields.
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
 * Student: James Mitchell Date: 9-20-2020
 */

public class CustomerDemoJM {


    public static void main(String[] args){

        // Create a CustomerJM object and pass the initialization
        // data to the constructor.
        // String n, String addr, String ph, String num, boolean list

        CustomerJM customer = new CustomerJM("James Mitchell",
                                "1234 New Road, Somewhere, TN 12345",
                                "615-678-1234",
                                "P2389",
                                true);

        // Display the data.
        System.out.println("Here's the first customer.");
        System.out.println(customer);

        // Create another CustomerJM object and use the set methods
        CustomerJM customer2 = new CustomerJM();
        customer2.setName("Jimmy Johnson");
        customer2.setAddress("333 First Street, Anywhere, CA 98765");
        customer2.setPhone("324-987-5678");
        customer2.setCustomerNumber("P9876");
        customer2.setList(false);

        // Display the data.
        System.out.println("\n\nHere's the second customer.");
        System.out.println(customer2);

    }

}
