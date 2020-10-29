class Humanbody{
void list(){
System.out.println("1.Eyes\n2.Gallbladder\n3.Heart\n4.Kidney");
}
void selectBodyPart(String operate){
System.out.println("Bodypart operated is:"+ operate);
}
String surgeryBodypart(){
return "Gallbaldder";
}
int bill(){
return 5000000;
}
String payBill(int amount){
System.out.print("The total amount is: "+amount);
return "paid";
}
}

class HumanbodyMethod{
public static void main(String args[]){
Bodypart surgery=new Bodypart();
surgery.list();
surgery.selectBodypart("Gallbladder");
System.out.println("Bodypart operated is: " +surgery.surgeryBodypart());
System.out.println("Bill amount is: "+ surgery.bill());
System.out.println(" Bill is: " +surgery.payBill(5000000));
}
}