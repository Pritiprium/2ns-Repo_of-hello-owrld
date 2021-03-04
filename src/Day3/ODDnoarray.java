package Day3;

import java.util.Scanner;

public class ODDnoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arrayofno = { 3, 8, 6, 14, 15, 17, 19 };
//		int odd;
//		for (int i = 0; i < arrayofno.length; i++) {
//			if (arrayofno[i] % 2 != 0) {
//				odd = arrayofno[i];
//				System.out.println("odd numbers of string: "+odd);
//			}
//		}

		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter the size of array");
		int size = scn.nextInt();
		System.out.println("Enter the elements inside Araay");
		int[] arrayelement = new int[size];
		int oddNumber;
		for (int i = 0; i < size; i++)
			arrayelement[i] = scn.nextInt();
		for (int i = 0; i < arrayelement.length; i++) {
			if (arrayelement[i] % 2 != 0) {
				oddNumber = arrayelement[i];
				System.out.println("Odd Numbers Of Array" + oddNumber);
				scn.close();
			}
		}
	}
}
