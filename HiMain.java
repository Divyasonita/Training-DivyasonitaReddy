class one 
{ 
public void print_div() 
{ 
System.out.println("divs"); 
} 
} 
  
class two extends one 
{ 
public void print_and() 
{ 
System.out.println("and"); 
} 
} 
  
class three extends one 
{ 
public void print_div() 
{ 
System.out.println("divs"); 
} 
} 
public class HiMain 
{ 
public static void main(String[] args) 
{ 
three d = new three(); 
d.print_div(); 
two t= new two(); 
t.print_and(); 
d.print_div(); 
} 
} 