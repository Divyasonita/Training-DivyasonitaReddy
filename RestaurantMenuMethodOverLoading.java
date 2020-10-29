class Restaurant{
void menu(){
System.out.println("1.Idly\n2.WadaSamabar\n3.Dosa\n4.Poori");
}
void takeOrder(String order){
System.out.println("Order given is "+order);
}
void takeOrder(String order1,String order2){
System.out.println("Order given is "+order1+" and "+order2);
}
void takeOrder(String order1,String order2,String order3){
System.out.println("Order given is "+order1+" and "+order2+" and "+order3);
}
}

class RestaurantMenuMethodOverLoading{
public static void main(String args[]){
Restaurant nanking=new Restaurant();
nanking.menu();
nanking.takeOrder("Dosa");
nanking.takeOrder("Dosa","Poori");
nanking.takeOrder("Dosa","Poori","WadaSambar");
}
}