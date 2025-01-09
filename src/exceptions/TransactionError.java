package exceptions;

public class TransactionError extends Exception {
	public TransactionError(String errorMessage) {
		System.out.println(errorMessage);
	}

	@Override
	public String toString() {
		return "Transaction Error";
	}
}
