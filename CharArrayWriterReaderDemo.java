package filesss;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterReaderDemo {
	public static void main(String[] args) throws IOException {
		 CharArrayWriter cw=new CharArrayWriter();
		 String str="This is divyasonita";
		 cw.write(str);
		 cw.append(" and is a trainee in ML");
		 CharArrayReader cr=new CharArrayReader(cw.toCharArray());
		 int i=cr.read();
		 while(i!=-1) {
			 System.out.print((char)i);
			 i=cr.read();
		 }
		 cw.close();
		 cr.close();
	}
}
