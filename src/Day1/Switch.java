package Day1;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;

		int c = 1;

		switch (c = 1) {
		case 1:
			System.out.println("addition of a and b is: " + (a + b));
			// break;
		case 2:
			System.out.println("substraction of a and b is: " + (a - b));
			// break;
		case 3:
			System.out.println("multiply of a and b is: " + (a * b));
			// break;
		case 4:
			System.out.println("division of a and b is: " + (a / b));
			// break;
		default:
			System.out.println(" define the right mode");

		}

	}

}
