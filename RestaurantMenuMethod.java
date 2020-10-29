class Restaurant{
void menu(){
System.out.println("1.Idly\n2.Wada\n3.Dosa\n4.Poori");
}
void takeOrder(String order){
System.out.println("Order given is: "+order);
}
String serveOrder(){
return "2 Dosa's";
}
int bill(){
return 105;
}
String payBill(int amount){
System.out.print("The bill amount: "+amount);
return "paid";
}
}

class RestaurantMenuMethod{
public static void main(String args[]){
Restaurant nanking=new Restaurant();
nanking.menu();
nanking.takeOrder("2 Dosa's");
System.out.println("Order Served is: " + nanking.serveOrder());
System.out.println("Bill amount is: "+ nanking.bill());
System.out.println(" is " + nanking.payBill(nanking.bill()));
}
}