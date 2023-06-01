package com.company;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main{
    public static void main(String [] args) throws IOException {
        // An array to write the file
        int[] numbers = { 2, 4, 6, 8, 10, 12, 14 };

        // Create the binary output objects
        FileOutputStream fstream = new FileOutputStream( "Numbers.dat");
        DataOutputStream outputFile = new DataOutputStream( fstream);

        System.out.println( "Writing the numbers to the file...");

        // Write the array elements to the file
        for (int number : numbers) outputFile.writeInt(number + 10);

        System.out.println( "Encryption Complete.");

        // Close the file
        outputFile.close();
    }
}
