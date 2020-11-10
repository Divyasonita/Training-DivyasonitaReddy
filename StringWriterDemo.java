package filesss;

import java.io.StringReader;

public class StringWriterDemo {
	public static void main(String[] args) throws Exception {  
        String srg = "MOTIVITY LABS";  
        StringReader reader = new StringReader(srg);  
        int k=0;  
            while((k=reader.read())!=-1){  
                System.out.print((char)k);  
            }  
        }  
}
