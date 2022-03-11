package assignment1.ques8;
class Student2
{
   int roll;
   String name;
   
 Student2()
 {
	 System.out.println("this is default contructer");
 }
public Student2(int roll, String name) {
	super();
	this.roll = roll;
	this.name = name;
}

}
public  class Student1 {

	public void main(String[] args) {
	
		
  Student2 s1=new Student2();
   System.out.println("student name is  "+s1.name +" student roll is "+s1.roll);
  
  
     Student2 s=new Student2(1,"aasiya");
     System.out.println(s.name);
     System.out.println(s.roll);

	}
	}

