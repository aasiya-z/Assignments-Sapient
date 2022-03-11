package assignment2.ques2;

public class AreaMain {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(2, 3);
		double ra = r.area();

		System.out.println("Area of rectangle:" + ra);

		Triangle t = new Triangle(4, 5);

		System.out.println("Area of triangle:" + t.area());

	}

}
