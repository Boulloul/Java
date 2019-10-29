package Map;

import java.util.*;


public class Sort {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Nadia");
		list.add("Yasser");
		list.add("Mohammed");
		list.add("Hanane");
		list.add("Badr");
		Collections.sort(list);
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());

	}

}
}