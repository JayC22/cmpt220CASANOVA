import java.text.DecimalFormat;
import java.util.Scanner; 

// JA: Always add comments to your code
public class Q7_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("####.###");
		double[] numbers = new double [10];
		double deviationresult;
		double meanresult;
		System.out.println("Enter ten numbers: ");
		
		for (int i=0; i<10; i++) {
			numbers[i] = input.nextDouble();
		}
		
		deviationresult = deviation(numbers);
		meanresult = mean(numbers);
		System.out.println("The mean is " + dec.format(meanresult));
		System.out.println("The standard deviation is " + dec.format(deviationresult));
	}
	
	public static double mean(double[]numbers) { 
		double sum = 0;
		double average;
		for (int i=0; i<10; i++) {
			sum += numbers[i];
		}
		
		average = sum/10;
		return average;
	}
	
	public static double deviation(double[]numbers) {
		
		double sum = 0;
		double sum1 = 0;
		double average = 0;
		double result;
		
		for (int i=0; i<10; i++) {
			sum1 += Math.pow((numbers[i]-average),2); // JA: Here average is 0. You should had called mean() before computing the standard deviation
		}
		result = sum1/9;
		result = Math.sqrt(result);
		return result;
	}

}
