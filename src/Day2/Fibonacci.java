package Day2;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =10;
		int num1 = 0;
		int num2 = 1;
		System.out.println("fibonacci series of "+count+ " number");
		for(int i=0;i<=count;++i) //earlier it was ++i i changed it to i++ but the result is same. 
		{
//			now swap the numbers			
			int sum = num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(num1+ " ");
		}		
				
		
	//using while loop	
		
//		int i=0;
//		while(i <=count) {
//			System.out.print(num1+" ");
//			int sum = num1+num2;
//			num1=num2;
//			num2=sum;
//			i++;
//		}
		
	}
	

}
