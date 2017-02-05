import java.util.Scanner;

public class Q35 {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);
		
		System.out.println("Enter todays date: ");
		
		int day = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today:  ");
		
		int future = input.nextInt();	
		System.out.println("Today is ");
		switch (day % 6){ // JA: You don't need to use the % operator here. This would never handle Saturday
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday");
		}
		
		System.out.println(" and the Future day is ");
		switch (future % 7){
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday");
		}
	}

}
