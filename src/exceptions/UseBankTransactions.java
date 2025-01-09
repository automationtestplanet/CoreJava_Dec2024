package exceptions;

public class UseBankTransactions {

	public static void main(String[] args) throws TransactionError {
		BankTransactions ameerpetBranch = new BankTransactions();
		BankTransactions kotiBranch = new BankTransactions();
		try {

			ameerpetBranch.deposit(5000, "SAVINGS");
			ameerpetBranch.checkBalance();

			kotiBranch.withdrawl(110000, "SAVINGS");
			kotiBranch.checkBalance();

			kotiBranch.deposit(250000, "SAVINGS");
			kotiBranch.deposit(250000, "SAVCURR");

		} catch (Exception e) {

		}
	}
}
