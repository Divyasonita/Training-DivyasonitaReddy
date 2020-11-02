import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(40);//to add element
		vector.add(60);
		vector.add(80);
		vector.add(70);
		vector.add(40);
		vector.add(75);
		vector.add(56);
		System.out.println(vector.capacity());//returns the size of vector
		System.out.println(vector.firstElement());//returns the head element
		System.out.println(vector.lastElement());//returns the last element
		System.out.println(vector.get(5));//returns the 5th element
		System.out.println(vector.hashCode());//returns the hashcode of the vector
		vector.set(1,80);//it is used to set an element
		System.out.println(vector.remove(2));//it removes the element
		System.out.println(vector);

	}

}
