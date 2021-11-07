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
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

class MonthSchedule {

	private Day days[];
	static Scanner s = new Scanner(System.in);

	public MonthSchedule(int day) {
		this.days = new Day[day];

		for (int i = 0; i < days.length; i++)
			days[i] = new Day();

	}

	public void input() {
		System.out.print("날짜(1~30)?>>");
		int day = s.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = s.next();
		days[day].set(work);
	}

	public void view() {
		System.out.print("날짜(1~30)?>>");
		int day = s.nextInt();
		System.out.print(day + "일의 할 일은 ");
		days[day].show();
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		s.close();
	}

	public void run() {
		System.out.println("이번달 스케줄 관리 프로그램.");
		while (true) {
			System.out.println();
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int index = s.nextInt();

			switch (index) {
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
		}
	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();

	}
}
