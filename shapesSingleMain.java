class shapes
{
double height,width;
void showDim()
{
System.out.println("Height is"+height);
System.out.println("Width is"+width);
}
}
class Triangle extends shapes
{
String style;
double area()
{
return width*height/2;
}
void showStyle()
{
System.out.println("Style is "+style);
}
}
class shapesSingleMain
{
public static void main(String args[])
{
Triangle t1=new Triangle();
Triangle t2=new Triangle();
t1.height=10;
t1.width=5;
t1.style="Filled";
t1.showStyle();
System.out.println("Area is"+t1.area());
System.out.println();
System.out.println();
t2.height=12;
t2.width=6;
t2.style="Rounded";
t2.showStyle();
System.out.println("Area is"+t2.area());
}
}
