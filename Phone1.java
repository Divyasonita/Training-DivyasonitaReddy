class Phone
{
String model_name;
int software_version;
String display;
static String company_name;
String storage;
}
public class Phone1
{
public static void main(String args[])
{
Phone P=new Phone();
P.model_name="iphone 11";
P.software_version=14;
P.display="6.06 inches";
P.company_name="Apple";
P.storage="128GB";
System.out.println("=============phone information============");
System.out.println("model_name is:"+P.model_name);
System.out.println("software_version is:"+P.software_version);
System.out.println("display is:"+P.display);
System.out.println("company_name is:"+P.company_name);
System.out.println("storage is:"+P.storage);
}
}





