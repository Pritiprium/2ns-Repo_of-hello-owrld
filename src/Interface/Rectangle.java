package Interface;

public class Rectangle implements Drawable ,Printable{
	public void draw() {
		System.out.println("this is unimplemented method of Drawable");
		System.out.println("Drawing REctangle");
	}

	public void print() {
		System.out.println("this is unimplemented metod of Printable");
		System.out.println("printing Printable method");	
	}
	

}
