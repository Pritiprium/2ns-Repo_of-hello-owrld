package practice;

public class Prime_no {
  static boolean checkprime(int checknumber) {
		boolean isprime = true;
		for(int j = 2; j<=checknumber/2; j++) {
			int remainder;			
			remainder = checknumber%2;
			if(remainder==0) {
				isprime = false;
				break;
			}
		}	
		return isprime;
	
	}
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
// WJP to print prime number
//		A prime number is a number that is only divisible by 1 or itself. 

		System.out.println("Prime numbers are : ");
		
		for (int i = 1; i <= 100; i++) {
		boolean b =	Prime_no.checkprime(i);
		if (b) {
			System.out.print(i+" ");

//		int num = 100;
//		for (int i = 2
//				; i <= num; i++) {
//			boolean isprime = true;
//			int remainder;
//			for (int j = 2; j <= i / 2; j++) {
//				
//				remainder = i % j;
//				if (remainder == 0) {
//					isprime = false;
//					break;
//				}
//			}
//				if (isprime) {
//					System.out.print(i + " ");
//				}
//			}
		}
		}		
		}
	}


//			int remainder;
//			boolean isprime = true;
//			for (int j = 2; j <= i / 2; j++) {
//				remainder = i % j;
//				if (remainder == 0) {
//					isprime = false;
//					break;
//	
