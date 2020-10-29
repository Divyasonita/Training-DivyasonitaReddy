class Employee{
int empid;
String empname;
int salary;
Employee(){
empid=1023;
empname="divya";
salary=43000;
}
void display(){
System.out.println("Employee id="+empid);
System.out.println("Employee name="+empname);
System.out.println("Employee salary="+salary);
}
}
class Constructor{
public static void  main(String args[]){
Employee divya=new Employee();
divya.display();
Employee sudha=new Employee();
sudha.display();
}
}

