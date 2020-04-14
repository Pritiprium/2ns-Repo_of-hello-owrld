package practice;

public class Polyparent {
	
	private String st = "Priti";
	public int a =10;
	protected int m = 10;
	void method1(int a, int b) {
		int c = a + b; 
		System.out.println("parent method is printing " + c);
	}
	void method1(int a,int b, int c) {
		c = a+b;
		System.out.println(c);
	}

	public class polychild extends Polyparent {
		void method1(int a, int b) {
			int c = a - b;
			System.out.println("child class is printing" + c);
		}

	}
	public static void main(String[] args) {
			Polyparent p1 = new Polyparent();
			p1.method1(20, 10);
			System.out.println(p1);
			polychild p2 = p1.new polychild();
			p2.method1(20, 10);
			System.out.println(p2);
			
			System.out.println(p1.st);

		}
	}

