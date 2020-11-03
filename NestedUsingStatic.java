class University{
	static class Department{
		void announcement() {
			System.out.println("result has been announced");
		}
		static void result() {
			System.out.println("visit the website for results");
		}
	}
	
}
public class NestedUsingStatic {

	public static void main(String[] args) {
		University.Department CSE=new University.Department();
		CSE.announcement();
		University.Department.result();

	}

}
