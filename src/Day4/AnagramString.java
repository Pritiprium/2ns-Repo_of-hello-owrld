package Day4;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramString {
	static boolean anagram(String s, String s1) {
		//char[] strn = new char[s.length()]; // converting string in to ch array
		//char[] strn1 = new char[s1.length()];
		char [] strn = s.toCharArray(); // inserting element of string in to ch array
		char []  strn1 = s1.toCharArray();
		if (strn.length != strn1.length) {
			System.out.println("Given string's length is not equal");
			return false;
// if both string's length are not equal then don't go to next step 
// and if both length are same then go to else condition 
		} else {
			Arrays.sort(strn); // now sorting the string character
			Arrays.sort(strn1);
			for (int i = 0; i < strn.length; i++) {
				if (strn[i] != strn1[i]) { // Comparing string
					return false;
				} 
				}
			}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string");
		String first = sc.nextLine();
		System.out.println("enter the second string");
		String second = sc.nextLine();
		first = first.toLowerCase();
		second = second.toLowerCase();
		boolean call = AnagramString.anagram(first, second);
		if (call) {
			System.out.println("given strings is anagram ");
		} else {
			System.out.println("given strings is not anagram");
		}
	}

}
