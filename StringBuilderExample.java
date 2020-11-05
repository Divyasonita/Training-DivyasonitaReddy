public class StringBuilderExample {
	
	    public static void main(String[] args) {
	        String str = "This is Divya Sonita Thirumalareddy";
			System.out.println("The input string is: "+str);
	        int len = str.length();
	        char[] arr1 = new char[len];
	        char[] arr2 = new char[len];
	        for (int i = 0; i < len; i++) {
	            arr1[i] = 
	                str.charAt(i);
	        } 
	        for (int j = 0; j < len; j++) {
	            arr2[j] =
	                arr1[len - 1 - j];
	        }
	        String revstr =
	            new String(arr2);
	        System.out.println("After operation, the input string becomes: "+revstr);
	    }
	}

