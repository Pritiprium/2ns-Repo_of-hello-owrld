package practice;

public class StudentLinklist implements Comparable <StudentLinklist>	 {
	public String name;
	public int age;
	public double height;
	StudentLinklist(String st,int age1,double height1){
		this.name=st;
		this.age = age1;
		this.height = height1;
	}
	@Override
	public int compareTo(StudentLinklist s) {
		// TODO Auto-generated method stub
		return this.name.compareTo(name);
		//return this.age - s.age;
	}

}
