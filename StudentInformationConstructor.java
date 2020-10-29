class Student{
int student_id;
String college_name;
String department;
String address;
String height;
int weight;
Student(int student_id,String college_name,String department,String address,String height,int weight){
this.student_id=student_id;
this.college_name=college_name;
this.department=department;
this.address=address;
this.height=height;
this.weight=weight;
this.display();
}
void display(){
System.out.println("==============Student Information==============");
System.out.println("Student id="+student_id);
System.out.println("College name="+college_name);
System.out.println("Department="+department);
System.out.println("Student address="+address);
System.out.println("Student height="+height);
System.out.println("Student weight="+weight);
}
}
public class StudentInformationConstructor{
public static void main(String args[]){
Student Divya= new Student(52,"ANRH","CSE","H.no:- 12-508/62,shanthinagar,SEC-BAD,500017","5.7",58);
Student Sudha= new Student(53,"ANRH","CSE","FLAT NO-203,UPPAL,SEC-BAD,500039","5.2",65 );
}
}