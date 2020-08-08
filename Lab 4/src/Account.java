public class Account {

	static int numAccounts = 0;

	public static void main(String[] args) {

		
		new Account("Here is an account one.");
		new Account("Here is an account two.");
		new Account("Here is an account three.");
		new Account("Here is an account four.");
		new Account("Here is an account five.");
		new Account("Here is an account six.");
		new Account("Here is an account seven.");

		System.out.println("The number of accounts are: " + Account.getNumAccounts());
	}

	public Account(String string) {
		numAccounts++;
	}

	static int getNumAccounts() {
		return numAccounts;

	}
}