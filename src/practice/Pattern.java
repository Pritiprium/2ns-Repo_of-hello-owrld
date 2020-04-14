package practice;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int space = a;
		for(int i =1; i<=a; i++) {
			for (int s=0;s<space;s++) {
				System.out.print(" ");
			}
			space--;
			for (int j =1; j<=i;j++){
				System.out.print("*"+" ");
				
			}
			
			System.out.println();
		}

	}

}
