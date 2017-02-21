import java.util.Scanner; 

public class q7_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter the 5 Number of elements");
		
		int[] numbers = new int[5];
		
		for (int i=0; i<5; i++) { 
			numbers[i] = input.nextInt();
		}
		gcd(numbers);

	}
	public static void gcd(int[] numbers) {
		int temp = numbers[0];
		
		for (int i=1; i<numbers.length; i++) {
			if (temp > numbers[i]) {
				temp = numbers[i];
			}
		}
		int last = temp;
		for (int re=0; re<numbers.length; re++) {
			boolean result = false;
			
			for(int j=0; j<numbers.length; j++) {
				if (numbers[j]%temp !=0) {
					result = false; break;
				} else {
					result = true;
				}
			}
			if (result) {
				break;
			} else {
				temp--;
			}
		}
		System.out.println("The GCD is " + temp);
	}

}
