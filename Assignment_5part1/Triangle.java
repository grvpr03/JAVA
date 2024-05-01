package Assignment_5part1;

public class Triangle implements Shape {

	private int height, base, side1,side2, side3;
		

	public Triangle(int height, int base, int side1, int side2, int side3) {
		this.height = height;
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double Area() {
		double area = 0.5*base*height;
		return area;
	}

	@Override
	public double Perimeter() {
		double perimeter = side1+side2+side3;
		return perimeter;
	}

}