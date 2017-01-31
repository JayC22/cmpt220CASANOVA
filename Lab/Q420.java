import java.util.Scanner;

public class Q420 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String l = input.nextLine();
		System.out.println(l + "s length is " + l.length() + " and the first letter of the string is " + l.charAt(0));

	}

}
