package fundamentals;

public class BankTransactionsWithConditions {

	static int mainBalance = 100000;

	void deposit(int depositAmount, String accountType) {
		if (accountType == "SAVINGS") {
			if (depositAmount <= 200000) {
				mainBalance += depositAmount;
			} else {
				System.out.println("More 2 Lakhs is not permitted to deposit for Savings account");
			}
		} else if (accountType == "CURRENT") {
			if (depositAmount <= 500000) {
				mainBalance += depositAmount;
			} else {
				System.out.println("More 2 Lakhs is not permitted to deposit for Current account");
			}
		} else if (accountType == "RETAIL") {
			if (depositAmount <= 1000000) {
				mainBalance += depositAmount;
			} else {
				System.out.println("More 2 Lakhs is not permitted to deposit for Retail account");
			}
		} else {
			System.out.println("Invalid Account Type, Please select option SAVINGS/CURRENT/RETAIL");
		}
	}

	void withdrawl(int withdrawlAmount, String accountType) {

		switch (accountType) {
		case "SAVINGS":

			if (withdrawlAmount <= 50000) {
				if (withdrawlAmount < mainBalance) {
					mainBalance -= withdrawlAmount;
				} else {
					System.out.println("Insuficient Balance");
				}
			} else {
				System.out.println("Transaction Limit for Savings account is less than or equals to 50000");
			}
			break;

		case "CURRENT":
			if (withdrawlAmount <= 200000) {
				if (withdrawlAmount < mainBalance) {
					mainBalance -= withdrawlAmount;
				} else {
					System.out.println("Insuficient Balance");
				}
			} else {
				System.out.println("Transaction Limit for Current account is less than or equals to 200000");
			}
			break;

		case "RETAIL":
			if (withdrawlAmount <= 500000) {
				if (withdrawlAmount < mainBalance) {
					mainBalance -= withdrawlAmount;
				} else {
					System.out.println("Insuficient Balance");
				}
			} else {
				System.out.println("Transaction Limit for Retail account is less than or equals to 500000");
			}
			break;
		default:
			System.out.println("Invalid Account Type, Please select option SAVINGS/CURRENT/RETAIL");
			break;
		}

	}

	void checkBalance() {
		System.out.println(mainBalance);
	}

	public static void main(String[] args) {
		BankTransactionsWithConditions ameerpetBranch = new BankTransactionsWithConditions();
		ameerpetBranch.deposit(5000, "SAVINGS");
		ameerpetBranch.checkBalance();

		BankTransactionsWithConditions kotiBranch = new BankTransactionsWithConditions();

		kotiBranch.withdrawl(110000, "SAVINGS");
		kotiBranch.checkBalance();

		kotiBranch.deposit(250000, "SAVINGS");
		kotiBranch.deposit(250000, "SAVCURR");
	}
}
