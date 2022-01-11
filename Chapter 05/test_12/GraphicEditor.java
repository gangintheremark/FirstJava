package test_12;

import java.util.Scanner;

abstract class Shape {
	public Shape next;  // ������ private Shape next;

	public Shape() {
		next = null;
	}

	public abstract void draw();
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class GraphicEditor {
	static Shape start, last, obj;
	static int index;

	public GraphicEditor() {
		this.start = null;
		this.last = null;
	}

	static void put(int num) { // ����
		switch (num) {
		case 1:
			if(start == null) {
				start = new Line();
				last = start;
				break;
			}
			obj = new Line();
			last.next = obj;
			last = obj;
			break;
		case 2: 
			if(start == null) {
				start = new Rect();
				last = start;
				break;
			}
			obj = new Rect();
			last.next = obj;
			last = obj;
			break;
		case 3:
			if(start == null) {
				start = new Circle();
				last = start;
				break;
			}
			obj = new Circle();
			last.next = obj;
			last = obj;
			break;	
		default:
			System.out.println("�ٽ� �Է����ּ���.");
		}
	}

	static void delete(int num) { // ����
		Shape tmp = start;
		Shape cur= start; // ������
		if(num ==1) {
			if(start == last) {
				start = null;
				last = null;
				return;
			}
			else {
				start = start.next;
				return;
			}
		}
		for(int i=1;i<num;i++) {
			cur = tmp;
			tmp = tmp.next;
			if(tmp == null) {
				System.out.println("������ �� �����ϴ�.");
				return;
			}
		}
		cur.next = tmp.next;
		
	}

	static void view() { // ��κ���
		Shape tmp = start;
		while( tmp != null) {
			tmp.draw();
			tmp = tmp.next;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("�׷��� ������ beauty�� �����մϴ�.");

		while (true) {
			System.out.print("����(1), ����(2), ��κ���(3), ����(4) >> ");
			int sel = s.nextInt();

			switch (sel) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3)>> ");
				int n = s.nextInt();
				put(n);
				break;
			case 2:
				System.out.print("������ ������ ��ġ>> ");
				int m= s.nextInt();
				delete(m);
				break;
			case 3:
				view();
				break;
			case 4:
				System.out.print("beauty�� �����մϴ�.");
				return;
			default:
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}

}
