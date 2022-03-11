package assignment1.ques8;


class Student
{
   int roll;
   String name;
   
   
    Student() 
{
	System.out.println("Default contructer");
}

	Student(int i, String n){  
		roll= i;  
		name = n;  
		}  
}
public class StudentDetails {

	public static void main(String[] args) {
		
  Student st=new Student();
  System.out.println("student name is  "+st.name +" student roll is "+st.roll);
  
  
  Student s=new Student(1,"aasiya");
  System.out.println(s.name);
  System.out.println(s.roll);
 
	}

}
