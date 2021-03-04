package inheritence ;
public class inheritance_demo {

	public static void main(String[] args) {
		
		B obj = new B();
//		obj.i =1;
//		obj.i = 2;
		obj.display();//this method will print from child method because this method is overridden
		// output of the program is 2.
	}

}
