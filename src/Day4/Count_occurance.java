package Day4;
import java.util.Scanner;

public class Count_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, check, count = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter the no for your array size ");
		num = scn.nextInt(); // this is for array size
		int array[] = new int[num]; //creating array for all elements
		System.out.println("Enter all elements");
		for (int i = 0; i < num; i++) {
			array[i] = scn.nextInt(); // user input inside the array
		}
		System.out.println("enter the element of which you want to check no of occurrence");
		check = scn.nextInt();  // for asking no which you want to check the occurrence
		for (int i = 0; i < num; i++) {
			if (array[i] == check) {
				count++;
			}
		}
		System.out.print("No of occurrence of elements:" + count);

	}
}
