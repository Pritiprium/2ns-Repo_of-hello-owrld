package homework;
//Find the frequency of each character in a given string String: 
//"Java is an object oriented programming language"
public class Frequency_of_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is an object oriented programming language";
		char [] characterarray = s.toCharArray();
		int [] freq = new int [s.length()];
		for (int i = 0 ; i <s.length();i++) { 
			freq[i]=1;
			for (int j = i+1; j<s.length();j++) {
				if(characterarray[i]==characterarray[j]) {
					freq[i]++;
					characterarray[j]='0';
					
				}
			}
		}
		System.out.println("character and their frequency are==>");
		for(int i = 0; i<freq.length;i++) {
			if( characterarray[i]!=' ' && characterarray[i]!='0') {
				System.out.println("Character : "+ characterarray[i] +" Frequency :" +freq[i]);
			}
		}
	}

}
