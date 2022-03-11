package assignment1.ques12;


public class ques12 {
	static String getCityByCode(int number)
	{
		if(number==1)
		{
			return "DELHI";
		}
		if(number==2)
		{
			return "NOIDA";
		}
		if (number==3)
		{
			return "GURGAON";
		}
		if(number==4)
		{
			return "BANGLORE";
		}
		return "INVALIDCODE";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   System.out.println(getCityByCode(3));
   System.out.println(getCityByCode(2));
   System.out.println(getCityByCode(8));
   
}
}
