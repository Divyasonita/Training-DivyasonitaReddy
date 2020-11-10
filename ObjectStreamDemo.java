package filesss;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fo=new FileOutputStream("C:\\DivyaSonita Reddy\\jnit2.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		String s="Object Stream Demo";
		oo.writeObject(s);
		oo.close();
		FileInputStream fi=new FileInputStream("C:\\DivyaSonita Reddy\\jnit2.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		s=(String)oi.readObject();
		System.out.println(s);
		oi.close();
	}
}
