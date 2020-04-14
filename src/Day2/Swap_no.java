package Day2;
import java.util.Scanner;

public class Swap_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		a = a*b;
		b = a/b;
		a = a/b;
			System.out.println("after swaping the numbers ");
		System.out.println("A ="+a);
		System.out.println("B ="+b);
		
			
	
		Scanner st = new Scanner(System.in);
		System.out.println("input value of A");
		int a1 = st.nextInt();
		System.out.println("input value of B");
		int b1 = st.nextInt();
		a1 = a1+b1;
		b1 = a1-b1;
		a1= a1-b1;
		
			System.out.println("after swap ");
			System.out.println(" Value of A is :" +a1);
			System.out.print("Value of B is :" +b1);
		
		
		

	}

}
