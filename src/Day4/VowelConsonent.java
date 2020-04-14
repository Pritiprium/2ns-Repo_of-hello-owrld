package Day4;
import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the statement");
		String s = sc.nextLine();
		s = s.toLowerCase();
		int vcount = 0;
		int ccount = 0;
		for(int i =0; i<s.length();i++) {
			char ch = s.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vcount++;
			}
			else if (ch>'a' &&ch<'z') {
				ccount++;
			}
		}
			System.out.println("ALL VOWEL LETTERS :-"+vcount);
			System.out.println("ALL CONSONENT LETTERS : "+ccount);
			
			}
			
		}
	

