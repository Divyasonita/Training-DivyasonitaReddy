class Phone
{
void cost()
{
System.out.println("No cost");
}
void processor()
{
System.out.println("No processor");
}
}
class Iphone extends Phone
{
void cost()
{
System.out.println("Iphone cost is 90thousand");
}
void processor()
{
System.out.println("Iphone processor is A13");
}
}
class Oneplus extends Phone
{
void cost()
{
System.out.println("Oneplus cost is 45thousand");
}
void processor()
{
System.out.println("Oneplus processor is 2.5GHz quad-core");
}
}
class PhoneMethodOverriding
{
public static void main(String args[])
{
Phone x=new Phone();
x.cost();
x.processor();
x.new Iphone();
x.cost();
x.processor();
x.new Oneplus();
x.cost();
x.processor();
}
}