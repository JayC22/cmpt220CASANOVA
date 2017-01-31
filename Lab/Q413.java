import java.util.Scanner;

public class Q413 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		char letter = input.next().charAt(0);
		
		
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || 
			letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
			System.out.println(letter + " is a vowel ");
		} else { 
		if (letter == 'b' || letter == 'c' || letter == 'd' || letter == 'f' ||letter == 'g' || letter == 'h' || letter == 'j' || letter == 'k' || letter == 'l' || letter == 'm' || letter == 'n' || letter == 'p' || letter == 'q' || letter == 'r' ||letter == 's' || letter == 't' ||letter == 'v' || letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z' || 
				letter == 'B' || letter == 'C' || letter == 'D' || letter == 'F' ||letter == 'G' || letter == 'H' || letter == 'J' || letter == 'K' || letter == 'L' || letter == 'M' || letter == 'N' || letter == 'P' || letter == 'Q' || letter == 'R' ||letter == 'S' || letter == 'T' ||letter == 'V' || letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z') {
			System.out.println(letter + " is a consonant ");
		} else {
			System.out.println(letter + " is an invlid input");
		}
		}

	}

}
