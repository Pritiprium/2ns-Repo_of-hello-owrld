package Day4;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveduplicateCH {
//	How to remove duplicate characters from String?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the chioce of string");
		String strng = sc.nextLine();
		String emptyStrng = "";		
		for (int i = 0; i < strng.length(); i++) {
		
			boolean duplicateFound = false;
			for (int j = 0; j < emptyStrng.length(); j++) {
				if (strng.charAt(i) == emptyStrng.charAt(j)) {
					duplicateFound = true;
					
					break;
				}
			}
			if (!duplicateFound) { //// not of boolean is always like false
				emptyStrng = emptyStrng.concat(String.valueOf(strng.charAt(i)));
			}
		}
		System.out.println(emptyStrng);

		
		
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		char [] ch_array = str.toCharArray();	//converting string in to charcter array	
		Set<Character> charcterset = new LinkedHashSet<Character>();//syntax for set
		for(char ch : ch_array ) { // checking each charcter and putting those ch in set 
			charcterset.add(ch);  // set will not add duplicate character
		}
		StringBuffer strngB = new StringBuffer();//syntax of stringBuffer
		for(Character character : charcterset) {// takeing character from set and adding that in string
			strngB.append(character);
		}
		System.out.println(strngB);
		
	
		
		
		
		
		String string = "aabbcc"
				+ "efatafaz";
		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
			charSet.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
		}
		System.out.println(sb.toString());
	}
}
