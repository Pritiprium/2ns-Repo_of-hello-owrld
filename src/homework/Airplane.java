package homework;
////Create interface Flight which has two method takeOff() and takeDown(). 
//Create a class Boeing which implements Flight 
//Now create one more class for Airbus which also implements Flight
//Lets create class Airplane which will be our main class. 
//Here we will instantiate both Boeing and Airbus class


public class Airplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight b = new Boing();
		Flight a = new AirBus();
		b.takeoff();
		b.takedown();
		System.out.println();
		a.takedown();
		a.takeoff();
		

	}
}
