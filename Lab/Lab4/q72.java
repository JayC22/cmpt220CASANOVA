import java.util.Scanner;

public class q72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[10];
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("EnterNumers: ");
		for(int i=0; i<10; i++) { 
			numbers[i] = input.nextInt();
			
		}
		for(int i=9; i>=0; i--) {
			System.out.println(numbers[i]);
		}

	}

}
