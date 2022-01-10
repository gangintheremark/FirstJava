package test_06;

import java.util.Scanner;

class Circle {
	double x, y;
	int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("가장 면적인 큰 원은 (" + x + "," + y + ")" + radius);
	}
}

public class CircleManager {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		
		Circle c[]  = new Circle[3];
		
		for(int i=0;i<c.length;i++) {
			System.out.print("x,y,radius >>");
			double x = s.nextDouble();
			double y = s.nextDouble();
			int radius = s.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		int i, max = 0;
		for(i=0;i<c.length;i++) {
			
			if(c[i].radius > c[max].radius )
				max = i;
		}
		c[max].show();
		
		s.close();
	}

}
