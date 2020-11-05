package com.exception;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
			String s=null;
			try {
				s.length();
			}catch(NullPointerException np) {
				np.printStackTrace();
			}
			int c=a/b;
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
	}

}