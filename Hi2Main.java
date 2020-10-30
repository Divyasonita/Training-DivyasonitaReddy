class one 
{ 
public void print_phone() 
{ 
System.out.println("Phone"); 
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
public void print_lappy() 
{ 
System.out.println("lappy"); 
} 
} 
public class Hi2Main 
{ 
public static void main(String[] args) 
{ 
three p = new three(); 
p.print_phone(); 
two t= new two(); 
t.print_and(); 
p.print_lappy(); 
} 
} 