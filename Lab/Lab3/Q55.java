import java.util.Scanner;

public class Q55 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    // Display the table heading
	    String output = "Kilograms         Pounds        Pounds        Kilograms \n";
	    
	
	    // Print table body
	    int k = 20;
	    for (int i = 1; i <= 199; i+=2) {
	    	output += i + " | ";
	       double j = 2.2;
	       
	        // Display the product and align properly
	    		  output += "  " + i * j + "                  ";
	    		  output += k + " | ";
	    		  output += "  " + k / j;
	    		  
	      
	      output += "\n";
	      
	      k += 5;

	    }
	    System.out.println(output);
	}

}