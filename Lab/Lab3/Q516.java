import java.util.Scanner;
public class Q516 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a integer: ");

		int num = input.nextInt();

		// JA: When finding the smallest factors, you need to decompose the numbers
		// JA: For example, if the input is 340, you need to find the smallest number that is a factor 
		// JA: and divide by the number, i.e., 2 is a factor and now your number is 170. You keep doing that 
		// JA: until the number is 1. So the factors of 340 are 2,2,5,17.
        int factor = 1;
        while (factor <= num) {
            if (num % factor == 0) {
                //num /= factor;
            	System.out.print(factor + " ");
            }
             factor++;
        }
        
        }

	}