
import java.util.HashMap;
import java.util.Map;
 
public class HashmapDemo{
public static void main(String[] args){
HashMa<String, Integer> map = new HashMap<>();
print(map);
map.put("divya", 20);
map.put("rits", 30);
map.put("janu", 60);
 
System.out.println("Size of map is" + map.size());
 
print(map);
if (map.containsKey("rits"))
{
Integer a = map.get("rits");
System.out.println("value for key \"mno\" is:- " + a);
}
 
map.clear();
print(map);
}
 
public static void print(Map<String, Integer> map){
if (map.isEmpty()){
System.out.println("map is empty");
}
else{
System.out.println(map);
}
}
}