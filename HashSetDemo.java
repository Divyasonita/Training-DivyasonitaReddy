
import java.util.Iterator;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> ll=new HashSet<>();
		ll.add("divya");
		ll.add("janu");
		ll.add("ritu");
		ll.add("yash");
		ll.add("naveen");
		ll.add("ronak");
		ll.add("hasini");
		System.out.println(ll);	
		System.out.println(ll.size());//show the size of HashSet
		Iterator<String> i=ll.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+ll.isEmpty());//it checks whether HashSet empty or not
		System.out.println(ll.contains("ritu"));//it checks whether the String is there in HashSet or not
		ll.clear();//it clears the data
		System.out.println("\n"+ll.isEmpty());
		System.out.println(ll.removeAll(ll));//it clear object

	}

}