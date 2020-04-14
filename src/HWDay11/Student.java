package HWDay11;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//Create student class with name(String type) and RegNo (int type) attributes. 
//use any collection to Store 5 student information. Sort using student name 
public class Student implements Comparable<Student> {
	public String name;
	public int regNo;
	Student(String Name, int Regno) {
		this.name = Name;
		this.regNo = Regno;
	}
	public static void main(String[] args) {
		LinkedList<Student> ls = new LinkedList<>();
		ls.add(new Student("Aarav", 10));
		ls.add(new Student("Yuval", 21));
		ls.add(new Student("Mihir", 30));
		ls.add(new Student("Saket", 20));
		ls.add(new Student("Pankaj",40));	
		Collections.sort(ls);	
		Iterator<Student> it = ls.iterator();
		while(it.hasNext()) {		
			Student tempstu = it.next();
			System.out.println("Student Name : " + tempstu.name + "Reg No : " + tempstu.regNo);
		}
	}
	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);

	}

}
