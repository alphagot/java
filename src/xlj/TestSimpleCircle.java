package xlj;
import java.util.Scanner;
public class TestSimpleCircle {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//double radius = sc.nextDouble();
		
		SimpleCircle Circle1 = new SimpleCircle();
	    Circle1.setRadius(10);
		System.out.println("Circle: "+Circle1.radius
				+"\nArea: "+Circle1.getArea()
				+"\nPerimeter: "
				+Circle1.getPerimeter());	
	}
}

class SimpleCircle {
	double radius;
	SimpleCircle() {
		radius = 1;
	}
	SimpleCircle(double radius) {
		this.radius = radius;
	}
	double getArea() {
		return radius * radius * Math.PI;
	}
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
}