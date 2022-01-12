import java.util.Scanner;

abstract class GameObject {
	protected int distance; // �� �� �̵��Ÿ�
	protected int x, y; // ���� ��ġ

	public GameObject(int startX, int startY, int distance) { // �ʱ� ��ġ�� �̵� �Ÿ� ����
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean collide(GameObject p) { // �� ��ü�� ��ü p�� �浹������ true�� ����
		if (this.x == p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}

	protected abstract void move(); // �̵��� �� ���ο� ��ġ�� x, y ����

	protected abstract char getShape(); // ��ü�� ����� ��Ÿ���� ���ڸ���

}

class Bear extends GameObject {
	public static Scanner s = new Scanner(System.in);

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	public void move() {
		System.out.print("����(a), �Ʒ�(s), ��(d), ������(f) >> ");
		String key = s.next();

		switch (key) {
		case "a": // ����
			if (y > 0)
				y--;
			break;
		case "s": // �Ʒ���
			if (x < 9)
				x++;
			break;
		case "d": // ����
			if (x > 0)
				x--;
			break;
		case "f": // ������
			if (y < 19)
				y++;
		}
	}

	public char getShape() {
		return 'B';
	}
}

class Fish extends GameObject {

	private int i = 0;
	private int j = 0;
	private int count = 0;

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	public void move() {
		int n = (int) (Math.random() * 2);
		if (i != 3 && n == 0) { // ���ڸ� ����
			i++;
			count++;
		} else if (j != 2 && n == 1) { // �����̵�
			j++;
			count++;
			while (true) {
				int r = (int) (Math.random() * 4 + 1);
				switch (r) {
				case 1: // ����
					if (y > 0)
						y--;
					return;
				case 2: // �Ʒ���
					if (x < 9)
						x++;
					return;
				case 3: // ����
					if (x > 0)
						x--;
					return;
				case 4: // ������
					if (y < 19)
						y++;
					return;
				default:
					continue;
				}
			}
		}
		if (count == 5) {
			i = 0;
			j = 0;
			count = 0;
		}
	}

	public char getShape() {
		return '@';
	}
}

public class Game {
	public static Scanner s = new Scanner(System.in);
	static public char[][] list = new char[10][20];
	static Bear bear = new Bear(0, 0, 1);
	static Fish fish = new Fish(5, 5, 1);

	static void delete() {
		list[bear.x][bear.y] = '-';
		list[fish.x][fish.y] = '-';
	}

	static void set_Bear() {
		list[bear.x][bear.y] = bear.getShape();
	}

	static void set_Fish() {
		list[fish.x][fish.y] = fish.getShape();
	}

	static void show() {
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++)
				System.out.print(list[i][j]);
			System.out.println();
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < list.length; i++)
			for (int j = 0; j < list[i].length; j++)
				list[i][j] = '-';
		
		System.out.println("** Bear�� Fish �Ա� ������ �����մϴ�.**");

		while(true) {
			if(bear.collide(fish)) {
				System.out.println("Bear Wins!");
				break;
			}
		set_Bear();
		set_Fish();
		show();

		delete();
		bear.move();
		fish.move();
		}

	}

}
