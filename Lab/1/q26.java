import java.util.Scanner;
public class q26 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();

	
		double s1 = i%10;
		double s2 = (i/10)%10;
		double s3 = i/100;
		System.out.println(s1 + s2 + s3);

	}

}
