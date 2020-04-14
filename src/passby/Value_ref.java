package passby;


public class Value_ref {
	
	String color;

	
	public void method1(int a ,int b) {
		System.out.println("method1 will be print as: "+(a+b));
		
	}
	public void method2(String s ,int b) {
		System.out.println("method2 will be print the name and age: "+s+"  " +b);
		
	}
	public void method3(boolean b) {
		System.out.println("method3 is printing:"+b);
	}
	
	public static void main (String [] args) {
		
		
		Value_ref f = new Value_ref();
		f.method1(12,12);
		f.method2("Priti", 10);
		f.color= "red";
		f.method3(false);
	}
	
	
	
	
}
	

