package exceptions;

public class BankTransactions {

	static int mainBalance = 100000;

	void deposit(int depositAmount, String accountType) throws TransactionError {
		if (accountType == "SAVINGS") {
			if (depositAmount <= 200000) {
				mainBalance += depositAmount;
			} else {
				throw new TransactionError("More 2 Lakhs is not permitted to deposit for Savings account");
			}
		} else if (accountType == "CURRENT") {
			if (depositAmount <= 500000) {
				mainBalance += depositAmount;
			} else {
				throw new TransactionError("More 2 Lakhs is not permitted to deposit for Current account");
			}
		} else if (accountType == "RETAIL") {
			if (depositAmount <= 1000000) {
				mainBalance += depositAmount;
			} else {
				throw new TransactionError("More 2 Lakhs is not permitted to deposit for Retail account");
			}
		} else {
			throw new TransactionError("Invalid Account Type, Please select option SAVINGS/CURRENT/RETAIL");
		}
	}

	void withdrawl(int withdrawlAmount, String accountType) throws TransactionError {

		switch (accountType) {
		case "SAVINGS":

			if (withdrawlAmount <= 50000) {
				if (withdrawlAmount < mainBalance) {
					mainBalance -= withdrawlAmount;
				} else {
					throw new TransactionError("Insuficient Balance");
				}
			} else {
				throw new TransactionError("Transaction Limit for Savings account is less than or equals to 50000");
			}
			break;

		case "CURRENT":
			if (withdrawlAmount <= 200000) {
				if (withdrawlAmount < mainBalance) {
					mainBalance -= withdrawlAmount;
				} else {
					throw new TransactionError("Insuficient Balance");
				}
			} else {
				throw new TransactionError("Transaction Limit for Current account is less than or equals to 200000");
			}
			break;

		case "RETAIL":
			if (withdrawlAmount <= 500000) {
				if (withdrawlAmount < mainBalance) {
					mainBalance -= withdrawlAmount;
				} else {
					throw new TransactionError("Insuficient Balance");
				}
			} else {
				throw new TransactionError("Transaction Limit for Retail account is less than or equals to 500000");
			}
			break;
		default:
			throw new TransactionError("Invalid Account Type, Please select option SAVINGS/CURRENT/RETAIL");
		}

	}

	void checkBalance() {
		System.out.println(mainBalance);
	}
}
