package HWDay11;

import java.util.ArrayList;
import java.util.Iterator;
//Write a program to get the position of a particular element in an Array List?
public class Positionofarraylist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> poslist = new ArrayList<>();
		poslist.add(12);
		poslist.add(24);
		poslist.add(36);
		poslist.add(48);
		poslist.add(60);
		Integer num = 48;
		Integer no = 36;
		for(int i=0; i<poslist.size();i++) {
			if(poslist.get(i)==no) {
				System.out.println("position of "+no+ ":"+i);
			}
		}
		System.out.println("position of "+num+ ":"+poslist.indexOf(48));
		
		
		
		
		
		
		
		/*Iterator<Integer> it =  poslist.iterator();
		while(it.hasNext()) {
			
		} */
		
		
		//System.out.println("position of 36 is "+poslist.subList(2, 4));
		//System.out.println("postion of 36 is"+poslist.indexOf(poslist));

	}

}
