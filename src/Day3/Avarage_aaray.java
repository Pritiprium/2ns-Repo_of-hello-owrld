package Day3;

public class Avarage_aaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sc = { { 70, 55, 70 }, { 80, 64, 41 } };
		int ts = 0;
		double [] average = new double[2];		
		sc[0][0] = 70;
		sc[0][1] = 55;
		sc[0][2] = 70;
		
		sc[1][0] = 80;
		sc[1][1] = 64;
		sc[1][2] = 41;
		
		for(int i = 0; i<2;i++) {
			ts=0;
			for (int j = 0; j <=2;j++) {
				ts = ts+sc[i][j];				
			}
			average[i] = ts/3;			
		}
		System.out.printf("Average of 1st student is : %2f",average[0]);
		System.out.println();
		System.out.printf("Average of 2nd student is : %2f", average[1]);
		
		
		
		
		
		
//		for(int i = 0; i<3;i++) {
//			for (int j = 0; j <=3;j++) {
//				ts=0;
//				ts = ts+sc[i][j];				
//			}
//			double average1 = 0;
//			average1=ts/3;
		
	//	System.out.println("Average of 2nd student is :%2f " + average1);
	}
////		ts = sc[0][0] + sc[0][1] + sc[0][2];
////		average = ts / 3;
//		System.out.println("Average of 1st student is :  " + average);
//		int sum = 0;
//		double average1;
//		sc[1][0] = 80;
//		sc[1][1] = 64;
////	sc[1][2] = 41;
////		sum = sc[1][0] + sc[1][1] + sc[1][2];
////		average1 = sum / 3;
////		System.out.println("Average of 2nd student is :%2f " + average1);
//		//
		
		//NOTE:---System.out.printf("Average of 2nd Student: %2f", average[1]/3);
		//for printing 2 digits after decimal
	}


