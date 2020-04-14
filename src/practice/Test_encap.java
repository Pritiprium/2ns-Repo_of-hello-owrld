package practice;

public class Test_encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		Encapsulate e = new Encapsulate();
		e.setName("Aarav Kumar");
		System.out.println("Name: "+e.getName());
		e.setAge(10);
		System.out.println("Age: "+e.getAge());
		e.setGrade("4th");
		System.out.println("Grade: "+e.getGrade());
		e.setSection('A');
		System.out.println("Section: "+e.getSection());
		

		
	}

}
