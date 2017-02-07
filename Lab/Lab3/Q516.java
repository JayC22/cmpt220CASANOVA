import java.util.Scanner;
public class Q516 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a integer: ");

		int num = input.nextInt();

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