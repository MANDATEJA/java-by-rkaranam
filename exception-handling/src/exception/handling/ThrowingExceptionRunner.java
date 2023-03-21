package exception.handling;

class Amount {
	private int amount;
	private String currency;

	public Amount(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public void add(Amount that) throws Exception {
		if (this.currency != that.currency) {
			// 1st way of throwing exception
			// throw new Exception("Currencies do not match " + this.currency + " & " + that.currency);
			// 2nd way of throwing exception
			throw new CurrenciesDoNotMatchException("Currencies do not match " + this.currency + " & " + that.currency);
		}

		this.amount += that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDoNotMatchException extends Exception {

	public CurrenciesDoNotMatchException(String str) {
		super(str);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws Exception {
		Amount amountOne = new Amount(55, "USD");
		Amount amountTwo = new Amount(74, "EUR");

		amountOne.add(amountTwo);
		System.out.println(amountOne);

	}

}
