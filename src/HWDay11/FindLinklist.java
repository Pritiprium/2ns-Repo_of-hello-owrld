package HWDay11;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//Implement singly linked list with following operations Insert and delete last 
//Insert and delete front Display FindMin FindMax Delete using position(first node has pos =0) 
public class FindLinklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> li = new LinkedList<>();
		li.add(32);
		li.add(34);
		li.add(54);
		li.add(67);
		

		Iterator <Integer> it = li.iterator();
		while (it.hasNext()) {
			System.out.println("elementsof list"+it.next());
		}
		Collections.sort(li);
		System.out.println();
			System.out.println("first element of array");
			System.out.println(li.peekFirst());
	System.out.println(li.peekLast());
		System.out.println(li.removeLast());
//		System.out.println(li.addFirst(12));
		li.addLast(99);
		li.peekFirst();
		li.remove(2);
		
		
	}

}
