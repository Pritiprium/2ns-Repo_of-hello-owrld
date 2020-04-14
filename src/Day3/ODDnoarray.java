package Day3;
public class ODDnoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayofno = { 3, 8, 6, 14, 15, 17, 19 };
		int odd;
		for (int i = 0; i < arrayofno.length; i++) {
			if (arrayofno[i] % 2 != 0) {
				odd = arrayofno[i];
				System.out.println("odd numbers of string: "+odd);
			}
		}
	}
}
