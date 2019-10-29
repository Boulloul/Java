package Collections;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		Iterator li=list.iterator();
		while(li.hasNext()) {
			String str = (String)li.next();
			System.out.println(str);
			
			
			if(str.equals("4")||str.equals("2"))
				li.remove();
			
		}
		System.out.println("///////////////////////////////");
		
			System.out.println(list.toString());
		
	}

}
