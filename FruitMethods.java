class FruitShop{
void list(){
System.out.println("1.Apple\n2.Mango\n3.Banana\n4.Papaya");
}
void selectFruit(String order){
System.out.println("Fruit selected is:"+order);
}
String handoverFruit(){
return "1 kg Mango";
}
int givebill(){
return 500;
}
String payBill(int amount){
System.out.print("The total amount is: "+amount);
return "paid";
}
}

class FruitMethods{
public static void main(String args[]){
FruitShop market=new FruitShop();
market.list();
market.selectFruit("1 kg Mango");
System.out.println("Fruit given is: " +market.handoverFruit());
System.out.println("Bill amount is: "+ market.givebill());
System.out.println(" Bill is: " +market.payBill(500));
}
}