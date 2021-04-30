/**
 * CISP1020 - Computer Science II
 *
 * Assignment - Chapter 10: #1 Employee and ProductionWorker Classes
 *
 * WorkerDemoJM.java file
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
 */

public class WorkerDemoJM {

    
    public static void main(String[] args){

        // Create a ProductionWorkerJM object and pass the initialization
        // data to the constructor.
        ProductionWorkerJM pw = new ProductionWorkerJM("James Mitchell", "238-M", "02/02/1986",
                                                        ProductionWorkerJM.DAY_SHIFT, 25.05);

        // Display the data.
        System.out.println("Here's the first production worker.");
        System.out.println(pw);

        // Create another ProductionWorkerJM object and use the set methods
        ProductionWorkerJM pw2 = new ProductionWorkerJM();
        pw2.setName("Jimmy Johnson");
        pw2.setEmployeeID("123-A");
        pw2.setHireDate("01/01/2000");
        pw2.setShift(ProductionWorkerJM.NIGHT_SHIFT);
        pw2.setHourlyPayRate(15.50);

        // Display the data.
        System.out.println("\n\nHere's the second production worker.");
        System.out.println(pw2);

    }

}
