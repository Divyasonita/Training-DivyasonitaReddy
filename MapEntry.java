import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"divya");
		hm.put(2,"ritu");
		hm.put(3,"yash");
		hm.put(4,"janu");
		hm.put(5,"ronak");
		hm.put(6,"naveen");
		hm.put(7,"hasini");
		
		Set<Map.Entry<Integer,String>> s= hm.entrySet();
	
		Iterator<Map.Entry<Integer, String>> i = s.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, String> entry=i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}