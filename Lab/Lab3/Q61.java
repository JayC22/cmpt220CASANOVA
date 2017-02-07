import java.util.Scanner;

public class Q61 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("The first 100 pentagonal number are:");
        for (int i = 1; i < 101; i++){
            System.out.printf("%7d ", getPentagonalNumber(i));
            if (i % 10 == 0)
                System.out.println();
        }
    }

    public static int getPentagonalNumber(int n){
        return (n * (3 * n - 1)) / 2;
	        

	}

}