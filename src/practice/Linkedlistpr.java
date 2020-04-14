package practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> la = new LinkedList<>();
		la.add(75);
		la.add(20);
		la.add(32);
		la.add(15);
//		la.add(null);//list can contain null also
		la.add(2, 25);// this is add value by index size.
		la.peekLast();
		la.addLast(40);// this is add as last index size
		Iterator <Integer> it = la.iterator();
		
//		for (int i = 0; i< la.size();i++) {// this is the way which we used to do 
//			System.out.println(la.get(i));
//		}
		while (it.hasNext()) {
			System.out.println("items of list are: =:"+it.next());// this is linkedlist iterator way
		}
		System.out.println();
		Collections.sort(la);//this is the method to sort in collections
		for(int i = 0 ; i<la.size();i++) {
			System.out.println("sorted Data are:="+la.get(i));
		}
	}
	
	
	
	StudentLinklist sl = new StudentLinklist("Aarav",10 , 4.09);
	
	
	
	
	
	

}
