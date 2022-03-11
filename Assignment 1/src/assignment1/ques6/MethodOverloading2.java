package assignment1.ques6;
class Student
{
	public void stuDetails(int roll, String name)
    {
        System.out.println("Roll :" + roll + " " + "Name :" + name);
    }
	public void stuDetails(String name,int roll)
	{
		 System.out.println("Name :" + name +" "+"Roll:" +roll);   //changing order of parameter
    }
	}

public class MethodOverloading2 {

	public static void main(String[] args) {
		
		Student st =new Student();
	    st.stuDetails(1, "aasiya");
	    st.stuDetails("aasiya", 1);
	}

}
