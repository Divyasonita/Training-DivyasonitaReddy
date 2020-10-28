class Shape
{
String shape_name;
int shape_width;
int shape_length;
int shape_area;
}
public class Shape1
{
public static void main(String args[])
{
Shape S=new Shape();
S.shape_name="Rectangle";
S.shape_width=2;
S.shape_length=4;
S.shape_area=8;
System.out.println("============Shape information============");
System.out.println("shape_name is:"+S.shape_name);
System.out.println("shape_length is:"+S.shape_length);
System.out.println("shape_width is:"+S.shape_width);
System.out.println("shape_area is:"+S.shape_area);
}
}
