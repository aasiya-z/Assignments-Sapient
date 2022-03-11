package assignment2.ques2;

public class Triangle extends Figure {

	protected int dim1;
	protected int dim2;

	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

	@Override
	public double area() {
		return (super.dim1 * super.dim2) / 2;
	}

}
