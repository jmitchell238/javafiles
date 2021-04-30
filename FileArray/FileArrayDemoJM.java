/*

CISP1020 - Computer Science II

Assignment - Chapter 11: #6 FileArray Class

FileArrayDemoJM.java file

Design a class that has a static method named writeArray.
The method should take two arguments:    the name of a file    and a reference to an int array.
The file should be opened as a binary file,
the contents of the array should be written to the file,
and then the file should be closed.

Write a second method in the class named readArray.
The method should take two arguments:    the name of a file    and a reference to an int array.
The file should be opened, data should be read from the file and stored in the array,
and then the file should be closed.

Demonstrate both methods in a program.

Due Date: October 14, 2020

Student: James Mitchell
Date: October 14, 2020

*/

public class FileArrayDemoJM {

    public static void main(String[] args) throws Exception{

        // Create int[] arrays to handle one for write, and one for read.
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] newArray = new int[array.length];

        // create new FileArrayJM object to be able to write and read binary file
        FileArrayJM file = new FileArrayJM();

        // Write to a binary file.
        file.writeArray("array.dat", array);


        // Read from the binary file.
        file.readArray("array.dat", newArray);

        // Test that newArray is the same as array.
        for(int i : newArray) {
            System.out.println(i);
        }
    }

}