package Day4;
import java.util.Scanner;

public class RemoveduplicateCH {
//	How to remove duplicate characters from String?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the chioce of string");
		String strng = sc.next();
		String emptyStrng = "";
			for (int i = 0; i < strng.length(); i++) { 
				boolean found = false;
				for (int j = 0; j < emptyStrng.length(); j++) {
				if (strng.charAt(i) == emptyStrng.charAt(j)) {
					found = true;
					break;
				}
			}
			if (found == false) { // if duplc not found concat 
				emptyStrng = emptyStrng.concat(String.valueOf(strng.charAt(i)));
			}
		}
		System.out.println(" after removing duplicate charcter : " + emptyStrng);

	}
}
