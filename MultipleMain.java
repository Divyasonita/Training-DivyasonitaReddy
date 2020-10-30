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
class three extends two 
{ 
public void print_rit() 
{ 
System.out.println("rits"); 
} 
} 
public class MultipleMain 
{ 
public static void main(String[] args) 
{ 
three d = new three(); 
d.print_div(); 
d.print_and(); 
d.print_rit(); 
} 
} 