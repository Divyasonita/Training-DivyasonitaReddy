import java.util.LinkedHashMap;
public class LinkedhashMapDemo 
{
public static void main(String[] args)
 {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();           
	      map.put(500,40);    
	     map.put(501,30);    
	     map.put(502,200);
	     map.put(502,302);
	     map.put(503,302);
	       //Fetching key  
	       System.out.println("Keys: "+map.keySet());  
	       //Fetching value  
	       System.out.println("Values: "+map.values());  
	       //Fetching key-value pair  
	       System.out.println("Key-Value pairs: "+map.entrySet()); 
	}

}i