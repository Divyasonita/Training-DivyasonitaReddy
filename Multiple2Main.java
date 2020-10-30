class one 
{ 
public void print_lappy() 
{ 
System.out.println("lappy"); 
} 
} 
class two extends one 
{ 
public void print_and() 
{ 
System.out.println("and"); 
} 
} 
class three extends two 
{ 
public void print_television() 
{ 
System.out.println("Television"); 
} 
} 
public class Multiple2Main 
{ 
public static void main(String[] args) 
{ 
three l = new three(); 
l.print_lappy(); 
l.print_and(); 
l.print_television(); 
} 
} 