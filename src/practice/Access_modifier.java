package practice;

public class Access_modifier {

	private String s = "Aarav";
	protected String a ="Aavya";
	public int i = 100;
	int n = 200;
	public void method (String s) {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_modifier ac = new Access_modifier();
		System.out.println(ac.a);
		System.out.println(ac.i);
		System.out.println(ac.n);
		System.out.println(ac.s);

	}

}
