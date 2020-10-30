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
public class Single2Main 
{ 
public static void main(String args[]) 
{ 
two p= new two(); 
p.print_phone(); 
p.print_and(); 
p.print_phone(); 
} 
} 