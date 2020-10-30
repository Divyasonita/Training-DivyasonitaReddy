interface Area
{
Public double area();
}
class Shapes 
{
private double height,width;
void setWidth(double w)
{
width=w;
}
void setHeight(double  h)
{
height=h;
}
double getWidth()
{
return width;
}

double getHeight()
{
return height;
}
class Triangle extends Shapes implements Area
{
Triangle(double w,double h)
{
setWidth(w);
setHeight(h);
}
public double area()
{
return getWidth()*getHeight()/2;
}
}
class Rectangle extends Shapes implements Area
{
Rectangle(double w,double h)
{
setWidth(w);
setHeight(h);
}
public double area()
{
return getWidth()*getHeight();
}
}
class InterfaceMethodMain
{
public static void main(String ards[])
{
Triangle t1=new Triangle(5,10);
Rectangle r=new Rentangle(6,12);
System.out.println(t1.area());
System.out.println(r.area());
}
}
}