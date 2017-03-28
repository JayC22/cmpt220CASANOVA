class CheckingsAccount extends Account {
	int overdraft = 500;
	public String toString() {
		return "Checkings Account " + "overdraft limit " + overdraft;
	}
}

class SavingsAccount extends Account {
		int overdraft = 0;
		public String toString() {
			return "Savings Account " + "overdraft limit " + overdraft;
		}
 }