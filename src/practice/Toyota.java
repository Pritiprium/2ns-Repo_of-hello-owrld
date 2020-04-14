package practice;

public class Toyota extends Abstract_Bike {
	 void run() {
		 System.out.println("Toyota run on two wheels drive");
		System.out.println("this methos is unimplimented method of Abstractbike class");
	}
	 void speed() {
		System.out.println("Toyota speed is 140");
	}

	 
	 public static void main(String[] args) {
		 Abstract_Bike ab = new Toyota();
		 ab.run();
		 ab.speed();
	}
}
