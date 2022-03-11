package assignment1.ques3andques4;
class Student {

static int a; 
static int b=10;
public void display()
{
 System.out.println("Value of a = "+a);
 System.out.println("Value of a = "+b);
}

}
public class staticVar {
	public static void main(String[] args)
	{
//accessing by creating object
Student s1 = new Student();
s1.display();
Student s2 = new Student();
s2.display();


//accessing through class name
Student.a++;
Student.b--;
s1.display();
System.out.println(Student.a);
System.out.println(Student.b);
}
}


