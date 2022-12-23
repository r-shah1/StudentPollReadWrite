//StudentPollInput.java
//takes in user input and writes to file numbers.txt
//By Ruhul Shah

import java.io.FileNotFoundException;     
import java.lang.SecurityException;       
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;  
import java.util.Scanner;                 

public class StudentPollInput {
	
	public static void main(String[] args) {	
		Scanner input =  new Scanner(System.in);
		System.out.println("Please enter survey responses "
				+ "or press Crtl +Z to save and terminate:");
				
		//open numbers.txt and output data
		try (Formatter output = new Formatter("numbers.txt")) {
			while (input.hasNext()) { // loop until end-of-file indicator
	            try { // output new record to file
	                output.format("%s%n", input.next());
	            }
	            catch (NoSuchElementException elementException) {
	                System.err.println("Invalid input. Please try again.");
	                input.nextLine(); // discard input so user can try again
	            }
	        }
		output.close(); //close file to save
		System.out.printf("%nAll responses saved to numbers.txt!");			
	    }
	      catch (SecurityException | FileNotFoundException | 
	         FormatterClosedException e) {
	         e.printStackTrace();
	      }
	}
}//End class StudentPollInput
