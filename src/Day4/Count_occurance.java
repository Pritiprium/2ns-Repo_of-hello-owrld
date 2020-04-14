package Day4;
import java.util.Scanner;

public class Count_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, check, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the no for your array size ");
		n = sc.nextInt(); // this is for array size
		int a[] = new int[n]; //creating array for all elements
		System.out.println("Enter all elements");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); // user input inside the array
		}
		System.out.println("enter the element of which you want to check no of occurrence");
		check = sc.nextInt();  // for asking no which you want to check the occurrence
		for (int i = 0; i < n; i++) {
			if (a[i] == check) {
				count++;
			}
		}
		System.out.print("No of occurrence of elements:" + count);

	}
}
