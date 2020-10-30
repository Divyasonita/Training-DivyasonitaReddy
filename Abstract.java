abstract class Car
{
abstract void cost();
abstract void milage();
void start()
{
System.out.println("Starts with a key");
}
}
class Audi extends Car
{
void cost()
{
System.out.println("Audi cost is 50lakhs");
}
void milage()
{
System.out.println("Audi milage is 10km");
}
}
class Bmw extends Car
{
void cost()
{
System.out.println("Bmw cost is 40lakhs");
}
void milage()
{
System.out.println("Bmw milage is 10km");
}
}
class Abstract
{
public static void main(String args[])
{
Car x=new Audi();
x.start();
x.cost();
x.milage();
x=new Audi();
x.cost();
x.milage();
x=new Bmw();
x.cost();
x.milage();
}
}

