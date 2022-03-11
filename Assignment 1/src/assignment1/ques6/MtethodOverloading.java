package assignment1.ques6;
class Addition
{
	public int add(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
    public int add(int a, int b, int c)  //by changing no of parameter 
    {
        int sum = a + b + c;
        return sum;
    }
    public double add(double a, double b, double c)
    {
        double sum = a + b + c;
        return sum;
    }
    
}

public class MtethodOverloading {

	public static void main(String[] args) {
		
		Addition ob = new Addition();
		 
		
		int res=ob.add(1, 3);
		System.out.println(res);
        int res1 = ob.add(1, 2, 3);
        System.out.println(res1);
        
        double res2 = ob.add(1.0, 2.0, 3.0);
        System.out.println(res2);
    }

	}


