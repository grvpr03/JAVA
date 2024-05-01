package Assignment_5part1;

public class Rectangle implements Shape {

	private int length, breadth;
	

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double Area() {
		double area = length*breadth;
		return area;
	}

	@Override
	public double Perimeter() {
		double perimeter = 2*(length+breadth);
		return perimeter;
	}

}