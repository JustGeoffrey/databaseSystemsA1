import java.io.IOException;

public class dbload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pagesize = 0 ;
		
		if(args.length == 3) {
			if(args[0].equals("-p")) {
				System.out.println("Made it");
			    try {
			        pagesize = Integer.parseInt(args[1]);
			    } catch (NumberFormatException nfe) {
					throw new NumberFormatException("Second Arguement must be an integer");
			    }
				
			    //Process the datafile
			    
			    
			} else {
				System.out.println(args[0]);
				System.out.println("First Arguement should be '-p' ");
			}
		} else {
			System.out.println("Incorrect amount of arguements, require 3 arguements in format '-p pagesize(integer) datafile.csv'");
		}

	}
}
