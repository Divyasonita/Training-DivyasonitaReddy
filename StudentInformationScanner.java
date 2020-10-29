import java.util.Scanner;
class Student{
int student_id;
int student_roll_no;
static String college_name;
static String department;
float percentage;
float height;
String address;
}
public class StudentInformationScanner{
public static void main(String args[]){
Student Divya= new Student();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student details");
Divya.student_id = sc.nextInt();
Divya.student_roll_no=sc.nextInt();
Student.college_name = sc.next();
Student.department = sc.next();
Divya.percentage = sc.nextFloat();
Divya.height = sc.nextFloat();
Divya.address = sc.next();
System.out.println("============Student Information============");
System.out.println("Student id="+Divya.student_id);
System.out.println("Student roll_no="+Divya.student_roll_no);
System.out.println("College name="+Student.college_name);
System.out.println("Department="+Student.department);
System.out.println("Student height="+Divya.height);
System.out.println("Student address="+Divya.address);
}
}