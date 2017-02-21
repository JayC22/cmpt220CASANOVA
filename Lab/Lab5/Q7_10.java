import java.util.Scanner;

public class Q7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[] numbers=new double[5];
		int indexofminnumber;
		System.out.println("Enter five numbers:");
		for(int i=0; i<5; i++) {
			numbers[i] = input.nextDouble();
		}
		indexofminnumber = indexOfSmallestElement(numbers);
		System.out.println("The index of smallest number is "+indexofminnumber);
		
	}
	public static int indexOfSmallestElement(double[]numbers) {
		
		double minimum = numbers[0];
		int indexOfmin = 0;
		
		for(int i=1; i<5; i++) {
			
			if(numbers[i]<minimum) {
				minimum = numbers[i];
				indexOfmin = i;
			}
		}
		
		return indexOfmin;

	}
	

	
}
