import java.util.Scanner;

// JA: Add comments to your code
public class Q51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"Enter and integer  (the input ends if it is 0): ");
		
		   int positive = 0, negative = 0, total = 0, count = 0;

		     float average;
		     int number = -1;
		
		while(number != 0) {
			number = input.nextInt();
			total += number;
	        count++;

	        if(number > 0){
	        positive++;
	        } else if(number < 0){
	        negative++;
	        }
	     
	     }
		
		average = total / count; // JA: Total and count are both integer, so the division will be an integer.
		// JA: You should make one of them as double or float.
		
	     System.out.println("The number of positives is "+ positive);
	     System.out.println("The number of negatives is "+ negative);
	     System.out.println("The total is "+ total);
	     System.out.println("The average is "+ average);
	     
	   }	
	}
