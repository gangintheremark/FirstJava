package test_14;

interface Shape {
	final double PI = 3.14;

	void draw(); // 도형을 그리는 추상 메소드

	double getArea(); // 도형의 면적을 리턴하는 추상 메소드

	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("반지름이 " + radius + "인 원 입니다.");
	}

	public double getArea() {
		return radius * radius * PI;
	}
}

class Oval implements Shape {
	private int width;
	private int height;
	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.println(width + "x" + height + " 사각형에 내접하는 타원입니다.");
	}
	public double getArea() {
		return width*height*PI;
	}

}

class Rect implements Shape {
	private int width;
	private int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.println(width + "x" + height + " 크기의 사각형 입니다.");
	}
	public double getArea() {
		return width*height;
	}
}

public class ShapeEx {

	public static void main(String[] args) {
		Shape[] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10,40);
		
		for(int i=0;i<list.length;i++) 
			list[i].redraw();
		
		for(int i=0;i<list.length;i++) 
			System.out.println("면적은 " + list[i].getArea());
		
	}

}
