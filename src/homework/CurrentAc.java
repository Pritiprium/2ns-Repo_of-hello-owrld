package homework;
//In the WithdrawAmount function Add charges (Extra 10% ) to withdraw only if it is a current account //

//Your account class will have double Balance; -> property // Add a property in Current account “ExtraCharges”. 
//when withdraw amount, If its current account Also add from ExtraCharges and print it. 

public class CurrentAc extends Account implements Entry {
	double extraCharge;
	double balance = 0;
	double withdrawanAmt = 0;
	CurrentAc(double balance) {
		this.balance = balance;
	}
	public double withdrawAmount(double amount) {
		this.extraCharge = amount / 10;
		this.balance = this.balance - (amount + this.extraCharge);
		this.withdrawanAmt = amount;
		return this.balance;
	}
	@Override
	public double makePayment() {
		return withdrawanAmt;
	}
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

}
