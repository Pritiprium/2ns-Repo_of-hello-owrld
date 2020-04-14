package practice;

public class Boxing_unboxing {

	static void boxingmethod (Integer i) {//passing Integer as object here.
		System.out.println(i);
	}
	static void unboxingmethod (int n) {//passing parameter as int(primitive data type)
		System.out.println(n);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer j = 10;	
		int a =10 ;
		//j = a; // case2 this is another way to convert Integer (object) to int (primitive data type)
	     Integer b = Integer.valueOf(a)  ;            // case1 to convert by human or inbuilt method
	 boxingmethod(a);   // but calling here as int (primitive data type)

		
		
		Integer p = new Integer(100);
		int p1 = p.intValue();       //this is one more way to convert Integer to int 
		
		unboxingmethod(p1);// but callimg method here as Integer(object)
		
		
	}

}
