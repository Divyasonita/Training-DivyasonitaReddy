class Student{
int id;
float percentage;
static String clg;
}
class Employee{
int employee_id;
int salary;
static String company_name;
}
class Variable{
public static void main(String args[]){
Student rahul=new Student();
rahul.id=1023;
rahul.percentage=76.5f;
Student.clg="TKR";
System.out.println("=============Student Details=============");
System.out.println("Student Id "+rahul.id);
System.out.println("percentage="+rahul.percentage);
System.out.println("college="+Student.clg);


Employee shiva=new Employee();
shiva.employee_id=2021;
shiva.salary=24000;
Employee.company_name="JNIT";
System.out.println("=============Employee Details=============");
System.out.println("employee id="+shiva.employee_id);
System.out.println("Employee salary="+shiva.salary);
System.out.println(Employee.company_name);
}
}