import java.util.Scanner;
public class q25 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		System.out.println( " The gratuity is $" + y/10 + 
				" and the total is $" + (x+(y/10))
				);

	}

}
