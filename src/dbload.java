import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class dbload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pagesize = 0 ;
		String filePath = "";
		String currentRow = "";
		BufferedReader csvReader;
		
		if(args.length == 3) {
			if(args[0].equals("-p")) {
			    try {
			        pagesize = Integer.parseInt(args[1]);
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

			      
			    //Process the datafile

			    
			    // Consume the header
			    String headerLine = csvReader.readLine();
			    while ((row = csvReader.readLine()) != null) {
			        String[] data = row.split(",");
			        // do something with the data
			    }
			    csvReader.close();
			    
			} else {
				System.out.println(args[0]);
				System.out.println("First Argument should be '-p' ");
			}
		} else {
			System.out.println("Incorrect amount of arguments, require 3 arguments in format '-p pagesize(integer) datafile.csv'");
		}

	}
}
