

import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Divya");
		ts.add("Janu");
		ts.add("Ronak");
		ts.add("Hasini");
		ts.add("Ritu");
		ts.add("Sari");
		ts.add("Yash");
		System.out.println(ts);	
		System.out.println(ts.first());//shows the first element.
		System.out.println(ts.last());//shows the last element.
		System.out.println(ts.lower("Janu"));//before the given string in accending order list
		System.out.println(ts.higher("Janu"));//after the given string in accending order list
		System.out.println(ts.size());//show the size of TreeSet
		System.out.println(ts.pollFirst());//it return the first element from list and remove from it
		System.out.println(ts.pollLast());//it return the last element from list and remove from it
		Iterator<String> i=ts.iterator();
		while (i.hasNext()) {
		System.out.print(i.next()+" ");
		}
		System.out.println("\n"+ts.isEmpty());//it checks whether TreeSet empty or not
		System.out.println(ts.contains("Ronak"));//it checks whether the String is there in TreeSet or not
		ts.clear();//it clears the data
		System.out.println("\n"+ts.isEmpty());
		System.out.println(ts.removeAll(ts));//it clear object

	}

}