import java.util.Scanner;

public class q21 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.println( x + " Celsius is " + (x * 9.0 / 5.0 + 32) );

	}

}
