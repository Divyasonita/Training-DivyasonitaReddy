import java.util.LinkedHashSet;  
  
public class LinkedHashSetDemo 
{   
    
      
    public static void main(String[] args)  
    {   
        LinkedHashSet<String> linkedset =  new LinkedHashSet<String>();   
        linkedset.add("divya");   
        linkedset.add("janu");   
        linkedset.add("ritu");   
        linkedset.add("yash");  
        linkedset.add("divya");  
        linkedset.add("naveen");              
        System.out.println("Size of LinkedHashSet = " + linkedset.size());   
        System.out.println("Original LinkedHashSet:" + linkedset);   
        System.out.println("Removing yash from LinkedHashSet: " + linkedset.remove("yash")); 
        System.out.println("Trying to Remove ronak which is not "+  "present: " + linkedset.remove("ronak"));   
        System.out.println("Checking if divya is present=" +   linkedset.contains("divya"));
        System.out.println("Updated LinkedHashSet: " + linkedset);   
    }   
}   
           
      
  
       
         
  