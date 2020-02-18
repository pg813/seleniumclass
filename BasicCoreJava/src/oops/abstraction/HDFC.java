package oops.abstraction;

public class HDFC implements RBI {

	@Override
	public void savingAccount() {
		System.out.println("HDFC Saving account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("HDFC current account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("HDFC debit card");
	}

	@Override
	public void creditCard() {
		System.out.println("HDFC credit card");
		
	}  

}
