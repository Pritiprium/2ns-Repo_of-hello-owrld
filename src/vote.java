import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vt = new Scanner (System.in);
		 System.out.println("enter  the aGE OF VOTER");
		 int Age = vt.nextInt();
		 
		   System.out.println("enter the gender of voter");
		   
		   char Gender = vt.next().charAt(0);
		  if(Age>=18 && Gender=='M'){
			  System.out.println("eligable for voting");
		  }
		  else if (Age>=18 && Gender=='F'){
			  System.out.println("Not eligable for voting");
		  }
		  else 
			  System.out.println("no action required");
		  
			  
			  
			  
		  }
		 
		

	}

