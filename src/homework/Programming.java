package homework;


//Create a class named 'Programming'. While creating an object of the class,

//if nothing is passed to it, then the message "I love programming languages" should be
//printed. If some String is passed to it, then in place of "programming languages" 
//the name of that String variable should be printed. 

public class Programming { 
	String name;

	Programming(String str) {
		this.name = str;
		if (str.equals("")) {
			System.out.println("I Love Programming Language");
		} else {
			System.out.println("I LOVE " + this.name);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programming p = new Programming("");
		Programming p1 = new Programming("INDIA");
		
		
	}

}
