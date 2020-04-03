import java.io.IOException;

public class dbload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pagesize = 0 ;
		
		if(args.length == 3) {
			if(args[0] == "-p") {
				
			    try {
			        pagesize = Integer.parseInt(args[1]);
			    } catch (NumberFormatException nfe) {
					throw new NumberFormatException("Second Arguement must be an integer");
			    }
				
			    //Process the datafile
			    
			    dd
			} else {
				System.out.println("First Arguement should be -p");
			}
		} else {
			System.out.println("Incorrect arguements, correct format '-p pagesize(integer) datafile.csv'");
		}
	}

}
