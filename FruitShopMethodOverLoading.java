class Fruitmarket{
void list(){
System.out.println("1.Apple\n2.Mango\n3.Banana\n4.Papaya");
}
void selectFruit(String order){
System.out.println("item ordered is "+order);
}
void selectFruit(String order1,String order2){
System.out.println("item ordered is "+order1+" and "+order2);
}
void selectFruit(String order1,String order2,String order3){
System.out.println("item Ordered is "+order1+" and "+order2+" and "+order3);
}
}

class FruitShopMethodOverLoading{
public static void main(String args[]){
Fruitmarket market=new Fruitmarket();
market.list();
market.selectFruit("Apple");
market.selectFruit("Apple","Mango");
market.selectFruit("Apple","Mango","Banana");
}
}