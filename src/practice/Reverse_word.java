package practice;

import java.util.Scanner;

public class Reverse_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();
		String[] wordarray = str.split(" ");//spliting the string and put in wordarray 
		sc.close();
		String space = "";//taking an empty string
		for (int i= 0 ; i<wordarray.length;i++) {//checking wordarray length
			String word = wordarray[i];//puting word array of i in word each word one by one
			String reverseword = " ";
			for (int j =word.length()-1;j>=0;j--) // taking each word reverse karke
				{
				reverseword = reverseword+word.charAt(j);//reversing each ch of word
			}
			space = space+reverseword;
		}
		System.out.println(space);
	}
			}
		

	


