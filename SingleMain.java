
class one 
{ 
public void print_div() 
{ 
System.out.println("Divs"); 
} 
} 
class two extends one 
{
public void print_and() 
{ 
System.out.println("and"); 
} 
} 
public class SingleMain 
{ 
public static void main(String args[]) 
{ 
two d= new two(); 
d.print_div(); 
d.print_and(); 
d.print_div(); 
} 
} 