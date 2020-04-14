package practice;

public class Test_abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Bike ab = new Honda();
		ab.run();
		ab.speed();
		//Abstract_Bike to = new Toyota();
		ab = new Toyota();
		ab.run();
		ab.speed();
		//to.run();
		//to.speed();
		
	}

}
