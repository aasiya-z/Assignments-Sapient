package assignment2.ques4;

public class MainClass {

	public static void main(String[] args) {
		CustomerExtend c = new PolicyInfo("John", 100, 57677878);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getContact());

	}

}
