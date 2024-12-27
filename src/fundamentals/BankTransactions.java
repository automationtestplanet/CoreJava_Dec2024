package fundamentals;

public class BankTransactions {

	static int mainBalance = 100000;

	void deposit(int depositAmount) {
//		mainBalance = mainBalance + depositAmount;
		mainBalance += depositAmount;
	}

	void withdrawl(int withdrawlAmount) {
//		mainBalance = mainBalance - withdrawlAmount;
		mainBalance -= withdrawlAmount;
	}

	void checkBalance() {
		System.out.println(mainBalance);
	}

	public static void main(String[] args) {
		BankTransactions ameerpetBranch = new BankTransactions();		
		ameerpetBranch.deposit(5000);		
		ameerpetBranch.checkBalance();
		
		BankTransactions kotiBranch = new BankTransactions();	
		
		kotiBranch.withdrawl(10000);
		kotiBranch.checkBalance();
	}

}
