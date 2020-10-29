class Television{
String ram;
int watts;
String color;
String version;
String display;
String company_name;
String processor_company_name;
String shape;

Television(String ram, int watts,String color,String version,String display,String company_name,String processor_company_name,String shape){
this.ram=ram;
this.watts=watts;
this.color=color;
this.version=version;
this.display=display;
this.company_name=company_name;
this.processor_company_name=processor_company_name;

this.shape=shape;
this.display();
}

void display(){
System.out.println("============Television Details===========");
System.out.println("Ram = " + ram);
System.out.println("Watts = " + watts);
System.out.println("Color = " + color);
System.out.println("Version = " + version);
System.out.println("Display in inches = " + display);
System.out.println("Company name = " + company_name);
System.out.println("Processor company name = " + processor_company_name);
System.out.println("Shape = " + shape );

}
}

public class TelevisionConstructor{
public static void main(String args[]){
Television LG=new Television("1GB",57,"Black","UHD 4K TV","55 inches","LG","Alpha 9","Rectangle");
Television Samsung=new Television("2GB",18,"Blue","OlED TV","32 inches","Samsung","Intel","Curve");
}
}