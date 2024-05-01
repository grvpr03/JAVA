package Assignment_5part1;

public class Circle implements Shape {

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
		
	}

	@Override
	public double Area() {
		double area = Shape.pi*radius*radius;
		return area;
	}

	@Override
	public double Perimeter() {
		double perimeter = Shape.pi*2*radius;
		return perimeter;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}