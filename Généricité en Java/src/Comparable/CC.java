package Comparable;

import java.util.*;


public class CC {

	public static void main(String[] args) {
		CD cd1=new CD("test","test1",25);
		CD cd2=new CD("test","test2",50);
		ArrayList<CD> list=new ArrayList<CD>();
		list.add(cd1);
		list.add(cd2);
		list.add(new CD("test","test3",75));
		list.add(new CD("test","test4",55));
		list.add(new CD("test","test5",65));
		Iterator<CD> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println("//////////////////////////////////////////");
		Collections.sort(list);
		Iterator<CD> it2=list.iterator();
	
		
		while(it2.hasNext()) {
		System.out.println(it2.next());

	}

	}

}
