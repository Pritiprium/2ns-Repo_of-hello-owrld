package Day4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagramwords {
	static boolean anagram(String s, String s1) {

		char[] shrt = new char[s.length()]; // converting string in ch array
		char[] shrt1 = new char[s1.length()];	
		if (s.length() != s1.length()) {
			// putting condtion if both string lentgth is not equal than
			return false;
		 } 
		  else {
			  Arrays.sort(shrt);
				Arrays.sort(shrt1);
				for (int a = 0; a < shrt.length; a++) {
					if (shrt[a] != shrt1[a]) {// now comparing both string
						return false;
					}
				}
			}
			return true;
		}
			/*// shorting first string char 
			 * for (int i = 0; i < s.length(); i++) {
			 *  for(int j = 0; j < s.length(); j++) 
			 * temp;     
	          if (shrt[i] == shrt[j]) {
	           temp = shrt[j];
			 * shrt[j] = shrt[i];
			 *  shrt[i] = temp; 
			 *  }}} 
			 *  for (int i = 0; i < s1.length(); i++)
			 * { for (int j = 0; j < s1.length(); j++) {
			 *  if (shrt1[i] == shrt1[j])
			 *  {
			 *   temp = shrt1[j]; 
			 *   shrt1[j] = shrt1[i];
			 *    shrt1[i] =temp;
			 *  }}}
			 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String firstStr = sc.nextLine();
		System.out.println("Enter second string");
		String secondStr = sc.nextLine();
		firstStr = firstStr.toLowerCase();
		secondStr = secondStr.toLowerCase();
		boolean isAnagram = Anagramwords.anagram(firstStr, secondStr);
		if (isAnagram) {
			System.out.println("string is anagram");
		} else {
			System.out.println("string is not anagram");
		}
	}

}
