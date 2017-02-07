import java.util.Scanner;

public class Q63 {
	
public static int reverse(int number) {
	int reverse = 0;
    while (number != 0) {
        reverse = (reverse * 10) + number % 10;
        number = number / 10;
    }
    return (reverse);
}

public static boolean isPalindrome(int number) {
    return (number == reverse(number));
}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter an integer: ");
        
        int number = input.nextInt();
        System.out.println("Reversed: " + reverse(number));

        if (number == reverse(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
	
	}
}
