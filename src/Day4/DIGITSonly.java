package Day4;
import java.util.Scanner;

public class DIGITSonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the choice of string");
		String digit = sc.nextLine();
		char[] str = digit.toCharArray();// converting string to ch array
		sc.close();
		boolean containDigit = false;
		for (int i = 0; i < str.length; i++) {
			int num = Character.getNumericValue(str[i]);// converting charcter to int
			if (num >= 0 && num <= 9) {
				containDigit = true;
				System.out.println("string contain digits " + str[i]);
			}
		}
		if (!containDigit) { //not of boolean is always like false
			System.out.println("string has not only digits,but character also");
		}
	}
}


