package mehodoverload;

import practice.Access;

public class Method extends Access {
	 
	public void method(int a ,int b) {
		int sum = a+b;
		System.out.println("method1 will be print as: "+sum);
		
	}
	public void method(String s ,int b) {
		System.out.println("method2 will be print the name and age: "+s+"  " +b);
		
	}
	public void method(boolean b) {
		System.out.println("method3 is printing:"+b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method a = new Method();
		a.method(10, 20);
		a.method("priti", 30);
		a.method(true);
	System.out.println(a.str);//this is from Access parent class which is protected 
	
		

	}

}
