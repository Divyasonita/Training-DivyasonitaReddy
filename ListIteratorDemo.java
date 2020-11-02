import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorDemo {
    public static void main(String[] args) {
      
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        System.out.println("ArrayList: " + numbers);


        ListIterator<Integer> iterate = numbers.listIterator();
        iterate.next();
        iterate.next();

        int number1 = iterate.previous();
        System.out.println("Previous Element: " + number1);

       
        int index1 = iterate.previousIndex();
        System.out.println("Position of the Previous element: " + index1);
    }
}