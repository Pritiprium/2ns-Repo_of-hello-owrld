package Interface;

public class Entry_drawable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Drawable d = new Rectangle();
		// d.draw();
		 d = new Circle();
		 d.draw();
		 
		 //Drawable dc = new Circle();
		 
		Printable p1 = new Circle();
		 System.out.println(p1.page);
		 System.out.println(p1.papername);
		
	}

}
