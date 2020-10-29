import java.util.Scanner;
class Humanbody{
String eyes;
String heart;
String kidney;
String display;
static String hospital_name;
}
public class HumanBodyScanner{
public static void main(String args[]){
Operation surgery=new Operation();
Scanner sc=new Scanner(System.in);
surgery.eyes = sc.next();
surgery.heart = sc.next();
surgery.kidney = sc.next();
surgery.display = sc.next();
Operation.hospital_name = sc.next();
System.out.println("Humanboyd Name = Divya");
System.out.println("Hopital Name = Apollo");
System.out.println("Company Name = " + Operation.hospital_name);
System.out.println("Eyes = " + surgery);
System.out.println("Heart = " + surgery);
System.out.println("Kidney = " + surgery);
System.out.println("Gallbladder = " + surgery);
System.out.println("Display in screen = " + surgery.display);
}
}