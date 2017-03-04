import java.text.DecimalFormat;

public class test {

	public static void main(String[] args) {
		DecimalFormat cd = new DecimalFormat("##.##");
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("Balance is: " + cd.format(account.getBalance()));
		System.out.println("Monthly interest is: " + cd.format(account.getMonthlyInterestRate()));
		System.out.println("Account created date: " + account.getDateCreated().toString());
		

	}

}
