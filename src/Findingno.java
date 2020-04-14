import java.util.Scanner;

public class Findingno {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Scanner st = new Scanner(System.in);
		System.out.println("enter a:-");
		
		int a = st.nextInt();
		System.out.println("enter b:-");
		int b = st.nextInt();
		System.out.println("enter c:-");
		int c = st.nextInt();
		if (a >b  && a>c) {
			System.out.println("a is the largest number:" +a);
		}
		else if(b>a && b>c) {
				System.out.println("b is the largest number:"  +b);
			}
			else {
				System.out.println("c is the  largest number:"  +c);
			}
				 //if (c>a&&c>b) {
			//		System.out.println("c is the largest: "  +c);
			//		if ()
				}
				}
			


