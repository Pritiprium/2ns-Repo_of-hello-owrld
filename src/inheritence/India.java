package inheritence;

public class India extends Asia_superclass{
	int age = 15;
	String name = "Raj";
	void voter () {
		System.out.println("this is child class method");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asia_superclass a = new Asia_superclass();
		a.voter();
		System.out.println(a.age);
		System.out.println(a.name);
		
		India i = new India();
		i.voter();
		System.out.println(i.age);
		System.out.println(i.name);
		Asia_superclass c = new India();
		c.voter();
		
		
	}

}
