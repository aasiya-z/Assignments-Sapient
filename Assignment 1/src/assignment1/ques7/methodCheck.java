package assignment1.ques7;
public class methodCheck 
   {
	void hello(int i)
	{
		System.out.println("printing integer "+i);
	}
	 void hello(byte i)
	{
		 System.out.println("printing byte "+i);
	}
	void hello(short i)
	{
		System.out.println("printing short "+i);
	}
	void hello(long i)
	{
		System.out.println("printing long "+i);
	}
	public static void main(String[] args)
	{
		methodCheck m=new methodCheck();
		m.hello(5);
	}
	
     }

