import java.util.Scanner;
public class q29 {

	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			double v0 = scanner.nextDouble();
			double v1 = scanner.nextDouble();
			double t = scanner.nextDouble();
			System.out.println( " The average acceleration is " + ( v1 - v0 ) / t );

	}

}
