package homework;

public class SavingAc extends Account implements Entry {
	double balance = 0;

	SavingAc(double balance) {
		this.balance = balance;
	}

	@Override
	public double withdrawAmount(double amount) {
		return 0;

	}

	@Override
	public double makePayment() {
		// TODO Auto-generated method stub
		return 0;
	}

}
