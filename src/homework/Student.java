package homework;
//Questio-Write a program to print the names of students by creating a Student class. 

//If no name is passed while creating an object of Student class,
//then the name should be "Unknown", 
//otherwise the name should be equal to the String value passed 
//while creating object of Student class.

public class Student {
	
	
	String s = "test";
	Student (){
		System.out.println("unknown");
	}
	Student(String name){
		System.out.println(name);
	}
	public static void main(String[] args) {		
		Student s = new Student();
		Student s1 = new Student("Priti");
		
	}
}







//Student(String studentname) {// constructor with parameter
//	if (studentname != "") {// if
//		this.name = studentname;
//	} else {
//		this.name = "unknown";
//	}
//}
//
//public static void main(String[] args) {
//	Student s = new Student("Priti");// calling constructor in which giving string name
//	System.out.println(s.name);
//	Student s1 = new Student("");// calling constructor in which giving no string name
//	System.out.println(s1.name);
//
