import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class dbload {

	public static void main(String[] args) {
		// Records will be fixed in size, with size of 372 bytes.
		final int recordSize = 372;
		final int recordBytes = 4;
		int pageSize = 0 ;
		String filePath = "";
		String currentRow = "";
		BufferedReader csvReader;
		
		if(args.length == 3) {
			if(args[0].equals("-p")) {
			    try {
			        pageSize = Integer.parseInt(args[1]);
			        filePath = args[3];
			        
			        // Open the file(csv)
			        csvReader = new BufferedReader(new FileReader(args[3]));
			    }
			    // Catch if the second argument isn't an integer
			    catch (NumberFormatException nfe) {
			    	
					throw new NumberFormatException("Second Arguement must be an integer");
			    } 
			    // Catch if the third argument is not a file that can be opened
			    catch (FileNotFoundException e) {
			    	throw new FileNotFoundException("Third Arguement must be a file");
			    }
			    
			    /* 
			     * Cannot store any records if the given page size cannot 
			     * store a record and the number of pages	
			    */
			    if(pageSize < recordSize + recordBytes) {
				    //All checks are done

				    
				    // Consume the header
				    String headerLine = csvReader.readLine();
				    while ((row = csvReader.readLine()) != null) {
				        String[] data = row.split(",");
				        // do something with the data
				    }
				    csvReader.close();
			    } else {
			    	System.out.println("The pagesize you entered is too small, must be atleast 376.");
			    }
			} else {
				System.out.println(args[0]);
				System.out.println("First Argument should be '-p' ");
			}
		} else {
			System.out.println("Incorrect amount of arguments, require 3 arguments in format '-p pagesize(integer) datafile.csv'");
		}

	}
}
