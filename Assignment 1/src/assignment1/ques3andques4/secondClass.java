package assignment1.ques3andques4;
class test
{
	void addition()
	{
		System.out.println("the addition is " +(Student.a+Student.b));
	}
}
public class secondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		test t=new test();
	   t.addition();
	
   //Calling student class from this class using Class name
    System.out.println(Student.a);
    System.out.println(Student.b);
	}

}
