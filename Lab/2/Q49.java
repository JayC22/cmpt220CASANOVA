import java.util.Scanner;
public class Q49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println( "Enter a character: ");
		
		char character = input.next().charAt(0);
		
		System.out.println(character + " in Unicode is " + (int)character);
		

	}

}
