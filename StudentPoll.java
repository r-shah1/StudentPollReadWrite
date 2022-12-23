//StudentPoll.java
//Reads numbers.txt, displays and writes to output.txt
//by Ruhul Shah

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileNotFoundException;     
import java.lang.SecurityException;             
import java.util.FormatterClosedException;  

public class StudentPoll {
	public static void main(String[] args) {

		//open numbers.txt, scan and write to output.txt
		try(Scanner input = new Scanner(Paths.get("numbers.txt"))) {
			Formatter output = new Formatter("output.txt"); // create file output.txt
			
			System.out.printf("Survey respones from numbers.txt:%n");
			
			//loop to read records from file
			while (input.hasNext()) {//while there is more to read
				//variable to hold records
				String numbersTxtRecords = input.next();
				
				//write each read record to output.txt
				output.format("%s%n", numbersTxtRecords);
				
				//display records
				System.out.printf("%s%n", numbersTxtRecords);
			}
		output.close(); //close file to save
		System.out.printf("%nAll responses saved to output.txt!");
		}
		
	    catch (IOException | NoSuchElementException | IllegalStateException e) {
	    	e.printStackTrace();
	    }
	}
}//End Class StudentPoll
