class Humanbody{
void list(){
System.out.println("1.Eyes\n2.Gallbladder\n3.Heart\n4.Kidney");
}
void operatebodypart(String operate){
System.out.println("bodypart operated is "+operate);
}
void operatebodypart(String operate1,String operate2){
System.out.println("bodypart ordered is "+operate1+" and "+operate2);
}
void operatebodypart(String operate1,String operate2,String operate3){
System.out.println("bodypart Operated is "+operate1+" and "+operate2+" and "+operate3);
}
}

class HumanbodyMethodOverLoading{
public static void main(String args[]){
Humanbody surgery=new Humanbody();
surgery.list();
surgery.operatebodypart("Eyes");
surgery.operatebodypart("Eyes","Kidney");
surgery.operatebodypart("Eyes","Kidney","Heart");
}
}