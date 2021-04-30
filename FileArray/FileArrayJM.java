/*

CISP1020 - Computer Science II

Assignment - Chapter 11: #6 FileArray Class

FileArrayJM.java file

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

// Import java.io.* packages to handle input and output objects.
import java.io.*;

public class FileArrayJM {

    // Method to write an Array to a binary file.
    public static void writeArray(String fileName, int[] array) throws Exception{

        // Create DataOutputStream to create a binary file.
        // Use fileName from Demo file and write from the array
        DataOutputStream output = new DataOutputStream(new FileOutputStream(fileName));

        // for each number in array
        for(int i : array) {
            //write the number to the binary file
            output.writeInt(i);
        }

        // close the output file
        output.close();
    }

    // Method to read an array from a binary file.
    public static void readArray(String fileName, int[] newArray) throws Exception{

        // Create DataInputStream object to read from binary file.
        // Use fileName from demo file and read into newArray in demo file.
        DataInputStream input = new DataInputStream(new FileInputStream(fileName));

        // Create boolean variable to determine End Of File
        boolean EOF = false;

        // While it's not the End Of File
        while(!EOF){

            // Try Catch Statement
            try{

                // for Loop to go through each integer in the binary file
                for(int i = 0; i < newArray.length; i++){

                    // read the number and place it in the newArray
                    newArray[i] = input.readInt();
                }
            }catch(EOFException e){ // Catch clause to find end of file
                // Change EOF to True
                EOF = true;
            }

        }
        // Close the file
        input.close();
    }

}