package practice;

public class Honda extends Abstract_Bike {
	void run() {
		System.out.println("Honda run onfour wheels drive");
		System.out.println("this method is from Abstract_Bike class");
	}
	void speed() {
		System.out.println("Honda speed is 120");
	}
	void color() {
		System.out.println("car color is red");
	}

	
	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();
		h.speed();
		h.color();
		Abstract_Bike ab = new Honda();
		ab.run();
		ab.speed();
	}
}
