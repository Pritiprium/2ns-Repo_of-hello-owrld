package homework;
/// Create class for Account // 
//Create class for Savings Account //
//Create class for Current Account // 
//In the Entry class create a function for WithdrawAmount() //
//In the Entry class create a function for Make Payment() //
//In the WithdrawAmount function Add charges (Extra 10% ) to withdraw only if it is a current account //
//Your account class will have double Balance; -> property // Add a property in Current account “ExtraCharges”. 
// when withdraw amount, If its current account Also add from ExtraCharges and print it. 



public interface Entry {
	
	public double withdrawAmount(double amount);
	
	public double makePayment ();

}
