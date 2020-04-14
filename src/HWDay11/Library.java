package HWDay11;

import java.util.Set;
import java.util.TreeMap;

//Consider student class with name and semester attribute and Library class with lib Num and total Books attributes
//. Store 5 Library objects as key and Student object as value in Tree Map object and print the content 
public class Library implements Comparable<Library> {
	int libno;
	int totlbook;
	Library(int libno, int totalbook) {
		this.libno = libno;
		this.totlbook = totalbook;
	}
	@Override
	public int compareTo(Library l) {
		return this.libno - l.libno;
	}
	public static void main(String[] args) {
		Student1 stu = new Student1("Aarav","sem1");
		Student1 stu1 = new Student1("Yuval","sem2");
		Student1 stu2 = new Student1("Mihir","sem3");
		Student1 stu3 = new Student1("Deepak","sem4");
		Student1 stu4 = new Student1("Akshay","sem5");
		Library lb = new Library(12,100);
		Library lb1 = new Library(32,300);
		Library lb2 = new Library(47,500);
		Library lb3 = new Library(20,400);
		Library lb4 = new Library(15,800);
		TreeMap<Library, Student1> ts = new TreeMap<Library, Student1>();
		ts.put(lb, stu);
		ts.put(lb1, stu1);
		ts.put(lb2, stu2);
		ts.put(lb3, stu3);
		ts.put(lb4, stu4);
		Set<Library> keys = ts.keySet();
		
		
		System.out.println("Student   " + "  Semester"  + "  Library no  "+  "  Total book  ");
		for (Library lib : keys) {
			Student1 stTemp = ts.get(lib);
			System.out.println(stTemp.name + "       " + stTemp.semester   +"       "+ lib.libno +"             " +lib.totlbook); 
		}

	}

}
