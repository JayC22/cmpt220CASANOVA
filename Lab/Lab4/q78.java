import java.util.Scanner;
public class q78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 10;

	        double[] numbers = new double[SIZE];
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter 10 double numbers: ");
	        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextDouble();

	        System.out.println("The average value is: " + average(numbers));

	    }

	    public static int average(int[] array) {
	        int total = 0;
	        for (int i = 0; i < array.length; i++) {
	            total += array[i];
	        }
	        return total / array.length;
	    }

	    public static double average(double[] array) {
	        double total = 0;
	        for (int i = 0; i < array.length; i++) {
	            total += array[i];
	        }
	        return total / array.length;
	    }

	    public static void printArray(int[] array, int numberPerLine) {

	        for (int i = 0; i < array.length; i++) {

	            System.out.printf("%4d", array[i]);
	            if ((i + 1) % numberPerLine == 0) System.out.println("");
	        }
	    }
	}
