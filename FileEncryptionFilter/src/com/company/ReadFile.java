package com.company;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        int number;                      // A number read from the file
        boolean endOfFile = false;       // EOF flag

        // Create the binary file input objects.
        FileInputStream fstream = new FileInputStream("Numbers.dat");
        DataInputStream inputFile = new DataInputStream(fstream);

        System.out.println("Reading numbers from the file:");

        // Read the contents of the file.
        while (!endOfFile)
        {
            try {
                number = inputFile.readInt();
                System.out.print(number + " ");
                }
            catch (EOFException e) {
                endOfFile = true;
                }
        }

        System.out.println("\nDone.");

        // Close the file.
        inputFile.close();
    }
}
