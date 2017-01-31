import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		int number1 = (int)(Math.random()*10); //
		int number2 = (int)(Math.random()*10); //
		int number3 = (int)(Math.random()*10); //
		
		System.out.print( 
				"What is " + number1 + " + " + number2 + " + " + number3 + " ? " );
		
		int answer = input.nextInt();
		System.out.println(number1 + " + " + number2 + " + " + number3 + " is " + ( number1 + number2 + number3 == answer));

	}

}
