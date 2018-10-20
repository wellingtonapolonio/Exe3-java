package entities;



public class Circle {
	private Double radius;

	public Circle( Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
}

