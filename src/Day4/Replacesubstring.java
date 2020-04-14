package Day4;
public class Replacesubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WJP to replace each substring of a given string that matches the given
		// regular expression
		// with the given replacement String: "Dog chases cat, Cat chases rat".
		// Note: Replace 'cat' with 'rat'
		String sa = "Dog chase cat , cat chase rat";
//		String sb_cat = sa.substring(10, 13);
//		String sb_rat = sa.substring(26, 29);
//	     sa = sa.replace(sb_cat, sb_rat);
//		System.out.println(sa);
//		System.out.println();
//		
//		with replace function		
		
//		String sa1 = sa.replace("cat", "rat");
//		System.out.println(sa1);
//		
		
		String sentence = " Dog chase cat,cat chase rat";
		String one = sentence.substring(11, 14);
		String two = sentence.substring(15, 18);
		System.out.println(sentence);
		System.out.println(one);
		System.out.println(two);

	}

}
