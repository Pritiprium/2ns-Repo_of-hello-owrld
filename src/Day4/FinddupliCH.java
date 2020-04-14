package Day4;
import java.util.Scanner;

public class FinddupliCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String strng = sc.nextLine();
		char[] chAofStrng = strng.toCharArray();// converting string in to character array
	
		for (int i1stloop = 0; i1stloop < strng.length(); i1stloop++) {
			int count = 1; // if duplicate ch found then count
			boolean dupVfound = false; // if duplicate ch found
			if (chAofStrng[i1stloop] != 0) {
				for (int j2ndloop = i1stloop + 1; j2ndloop < strng.length(); j2ndloop++) {
					if (chAofStrng[i1stloop] == chAofStrng[j2ndloop]) {
						chAofStrng[j2ndloop] = 0;
						dupVfound = true;
						count++;
					}
				}
				if (dupVfound) {
					System.out.println("duplicate ch in string are: " + chAofStrng[i1stloop] + " " + count);
				}
			}
		}
		String newStr = new String(chAofStrng);
		System.out.println("after removing duplicate chracter: " + newStr);
	}

	/*
	 * //boolean dupvfound = false;
	 * 
	 * char[] inp = s.toCharArray(); System.out.println("Duplicate charcters are");
	 * for (int i = 0; i < s.length(); i++) { boolean dupvfound = false; for (int j
	 * = i + 1; j < s.length(); j++) { if (inp[i] == inp[j]) {
	 * System.out.print("duplicate value of charcter: "+inp[i]+"="+inp[j]); count++;
	 * if (dupVfound=true;) //System.out.print(count); break; }
	 * 
	 * 
	 * } }
	 */

}
