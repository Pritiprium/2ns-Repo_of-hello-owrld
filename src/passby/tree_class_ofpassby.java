package passby;


public class tree_class_ofpassby {
	
	public void method1(int i) {
		i = 200;
	}
	
		
	public void method(Value_ref f) {
		f.color= "white";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub-
		tree_class_ofpassby t = new tree_class_ofpassby();
		int i = 10;
		t.method1(i);
		System.out.println(i);
		
		
		
//		pass by reference		
		
		Value_ref f1 = new Value_ref();
		
		
		
		
		
		
		f1.color = "red";
		t.method(f1);
		System.out.println(f1.color);
		
		
		
	}		
	
	
		
		
}
