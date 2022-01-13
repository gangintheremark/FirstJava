package test_01;

class MyPoint {
	private int x;
	private int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {  // toString() 오버라이딩
		return "Point(" + x + "," + y + ")";
	}

	public boolean equals(Object obj) { // equals() 오버라이딩
		MyPoint p = (MyPoint) obj;
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}

}

public class MyPointEx {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(3, 50);
		System.out.println(p);

		if (p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");

	}

}
