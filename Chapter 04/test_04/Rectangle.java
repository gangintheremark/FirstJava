package test_04;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;

	int square() {
		return this.width * this.height;
	}

	void show() {
		System.out.printf("(%d,%d)���� ũ�Ⱑ %dX%d�� �簢��\n", x, y, width, height);
	}

	boolean contains(Rectangle r) {
		if (x < r.x && y < r.y)
			if ((x + width) > (r.x + r.width) && (y + height) > (r.y + r.height))
				return true;
		return false;
	}

	public Rectangle(int a, int b, int c, int d) {
		this.x = a;
		this.y = b;
		this.width = c;
		this.height = d;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();

		System.out.println("s�� ������ " + s.square());
		if (t.contains(r))
			System.out.println("t�� r�� �����մϴ�.");
		if (t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");

	}
}
