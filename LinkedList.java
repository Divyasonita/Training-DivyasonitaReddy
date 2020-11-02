import java.util.*; 
  
public class LinkedList { 
  
    public static void main(String args[]) 
    { 
        // Creating object of the 
        // class linked list 
        LinkedList<String> ll 
            = new LinkedList<String>(); 
  
        
        ll.add("divya"); 
        ll.add("ritu"); 
        ll.addLast("janu"); 
        ll.addFirst("yash"); 
        ll.add(2, "naveen"); 
  
        System.out.println(ll); 
  
        ll.remove("ritu"); 
        ll.remove(3); 
        ll.removeFirst(); 
        ll.removeLast(); 
  
        System.out.println(ll); 
    } 
} 