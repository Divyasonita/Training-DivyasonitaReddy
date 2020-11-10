package filesss;

public class BufferedWriterExample {
	public static void main(String[] args) throws Exception {     
	    FileWriter writer = new FileWriter("C:\\DivyaSonita Reddy\\testout1.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to motivitylabs");  
	    buffer.close();  
	    System.out.println("Success");  
	    }  
}
