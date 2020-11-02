package com.queue;
import java.util.Iterator;
import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<String> ll=new ArrayDeque<>();
		ll.add("divya");
		ll.add("ritu");
		ll.add("yash");
		ll.add("nanveen");
		ll.add("Nikhil");
		ll.add("janu");
		System.out.println(ll);
		System.out.println(ll);
		System.out.println(ll.size());//show the size of PriorityQueue
		ll.remove(5);//remove the value of index
		System.out.println(ll.peek());//it return the first element from list
		System.out.println(ll.poll());//it return the first element from list and remove from it
		Iterator<String> i=ll.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+ll.isEmpty());//it checks whether PriorityQueue empty or not
		System.out.println(ll.contains("yash"));//it checks whether the String is there in PriorityQueue or not
		ll.clear();//it clears the data
		System.out.println("\n"+ll.isEmpty());
		System.out.println(ll.removeAll(ll));//it clear object

	}

}