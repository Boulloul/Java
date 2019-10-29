package Map;

import java.util.*;
import java.util.Map.Entry;;

public class Main3 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"un");
		map.put(2,"deux");
		map.put(3,"trois");
		map.put(4,"quatre");
		map.put(5,"cinq");
		Set<Entry<Integer,String>> setEntry = map.entrySet();
		Iterator<Entry<Integer,String>> iEntry= setEntry.iterator();
		System.out.println("Parcours d'une map avec setEntry : ");
		while(iEntry.hasNext()) {
			Entry<Integer,String> entry=iEntry.next();
			
			System.out.println("Valeur pour la clé "+ entry.getKey()+" est "+entry.getValue());
	}

}

	}


