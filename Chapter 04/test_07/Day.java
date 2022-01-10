package test_07;

import java.util.Scanner;

public class Day {

	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}

}

class MonthSchedule {
	Day days[];
	Scanner s = new Scanner(System.in);

	public MonthSchedule(int day) {
		this.days = new Day[day];
		for (int i = 0; i < days.length; i++)
			days[i] = new Day();
	}

	public void input() {
		System.out.print("��¥(1~30)?");
		int day = s.nextInt();

		System.out.print("����(��ĭ�����Է�)?");
		String work = s.next();

		days[day].set(work);
	}

	public void view() {
		System.out.print("��¥(1~30)?");
		int day = s.nextInt();

		System.out.print(day + "���� �� ���� ");
		days[day].show();

	}

	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}

	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int num = s.nextInt();

			switch (num) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				return;
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4������ �� �� 

		april.run();
	}
}
