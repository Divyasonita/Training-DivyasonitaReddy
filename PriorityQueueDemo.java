import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("divya"); //to add an element 
		queue.add("ritu");  
		queue.add("janu");  
		queue.add("yash");  
		queue.add("nanveen");
		queue.add("sari");
		System.out.println("head:"+queue.element());  //returns the head element
		System.out.println("head:"+queue.peek());  //returns the peek element
		System.out.println("iterating the queue elements:");  
		Iterator<String> itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.print(itr.next()+" ");  
		}  
		System.out.println();
		queue.remove();//removes the last element  
		queue.poll();//removes the last element  
		System.out.println("after removing two elements:");  
		Iterator<String> itr4=queue.iterator();  
		while(itr4.hasNext()){  
		System.out.print(itr4.next()+" ");  
	}
	}
}