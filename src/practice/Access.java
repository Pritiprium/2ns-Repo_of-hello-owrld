package practice;

public class Access {
	private String st = "India";
	int t= 201;
	protected String str = "aavya";
	private void method() {
		System.out.println("this is a private method");					
	}
	protected void method(int a) {
		
		System.out.println("this is a protected method"  +a);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_modifier a = new Access_modifier();
		System.out.println(a.a);
		System.out.println(a.i);
		System.out.println(a.n);
// in this class private string of Access_modifier is not accessible.
		Access as = new Access();
		as.method();
		System.out.println(as.st);
		System.out.println(as.t);	
		as.method(12);
		
		
	}	
		
	}		
		
	
	


