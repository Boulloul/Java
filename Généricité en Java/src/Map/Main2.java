///////////////////////////// KeySet:


package Map;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"un");
		map.put(2,"deux");
		map.put(3,"trois");
		map.put(4,"quatre");
		map.put(5,"cinq");
		Set<Integer> setInt=map.keySet();
		Iterator<Integer> i= setInt.iterator();
		while(i.hasNext()) {
			int key = i.next();
			System.out.println("Valeur pour la clé "+ key+" est "+map.get(key));
	}

}
}
