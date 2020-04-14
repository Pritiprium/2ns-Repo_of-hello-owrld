package practice;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank_abstract ba = new SBI();
		System.out.println("RAte of Interest is:" + ba.rateofinterest()+"%");
		
		ba = new PNB();
		System.out.println("Rate of Interst is : " + ba.rateofinterest()+"%");
	}

}
