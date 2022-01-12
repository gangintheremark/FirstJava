import java.util.Scanner;

abstract class GameObject {
	protected int distance; // 한 번 이동거리
	protected int x, y; // 현재 위치

	public GameObject(int startX, int startY, int distance) { // 초기 위치와 이동 거리 설정
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

	public boolean collide(GameObject p) { // 이 객체가 객체 p와 충돌했으면 true로 리턴
		if (this.x == p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}

	protected abstract void move(); // 이동한 후 새로운 위치로 x, y 변경

	protected abstract char getShape(); // 객체의 모양을 나타내는 문자리턴

}

class Bear extends GameObject {
	public static Scanner s = new Scanner(System.in);

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	public void move() {
		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		String key = s.next();

		switch (key) {
		case "a": // 왼쪽
			if (y > 0)
				y--;
			break;
		case "s": // 아래쪽
			if (x < 9)
				x++;
			break;
		case "d": // 위쪽
			if (x > 0)
				x--;
			break;
		case "f": // 오른쪽
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
		if (i != 3 && n == 0) { // 제자리 정리
			i++;
			count++;
		} else if (j != 2 && n == 1) { // 랜덤이동
			j++;
			count++;
			while (true) {
				int r = (int) (Math.random() * 4 + 1);
				switch (r) {
				case 1: // 왼쪽
					if (y > 0)
						y--;
					return;
				case 2: // 아래쪽
					if (x < 9)
						x++;
					return;
				case 3: // 위쪽
					if (x > 0)
						x--;
					return;
				case 4: // 오른쪽
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
		
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");

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
