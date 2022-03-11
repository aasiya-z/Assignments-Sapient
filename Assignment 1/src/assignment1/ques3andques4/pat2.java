package assignment1.ques3andques4;
class Employee
{   
	int a=10;
	static int id=101;

	void show()
	{   
		System.out.println(a);
		System.out.println(id);  //accessing static variable from ordinary within class
	}
	static void display()
	{
		//System.out.println(a);  //can't access
		System.out.println(id);
	}
}
public class pat2 {

	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.show();
		emp.display();
		
		
		emp.id=121;
		emp.a=21;
		Employee.id=131;
				
	
    System.out.println(emp.a);
	System.out.println(Employee.id);
	}

}
