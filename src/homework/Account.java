package homework;

import java.util.Scanner;

public class Account {
	public static void main(String[] args) {
		CurrentAc cu = new CurrentAc(1000);	
		System.out.println("enter the Account type S for Saving and C for Current");
		Scanner sc = new Scanner(System.in);
		String accountType = sc.nextLine();	
		System.out.println("enter the Amount for Withdraw");
		double amt = sc.nextDouble();
		sc.close();
		System.out.println("Total Amount in current A/C:" +cu.balance);
		if(accountType.equalsIgnoreCase("C")) {
			System.out.println("Remaining balance:  "+cu.withdrawAmount(amt));
			System.out.println("Amount withdrawed: "+cu.makePayment() );

		}
		
	}
	
}
