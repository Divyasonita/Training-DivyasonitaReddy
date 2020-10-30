class Sports
{
void sit()
{
System.out.println("Do sit");
}
void run()
{
System.out.println("Do run");
}
}
class Indoor extends Sports
{
void sit()
{
System.out.println("All indoor games are indside");
}
void run()
{
System.out.println("Indoor games can also be physical");
}
}
class Outdoor extends Sports
{
void sit()
{
System.out.println("Outdoor games mostly physical");
}
void run()
{
System.out.println("Outdoor games can be only be physical");
}
}
class SportsMethodOverriding
{
public static void main(String args[])
{
Sports x=new Sports();
x.sit();
x.run();
x.new Indoor();
x.sit();
x.run();
x.new Outdoor();
x.sit();
x.run();
}
}