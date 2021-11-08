package test_12;

import java.util.Scanner;

class Reserve {
	String[] tmp;
	String name;
	int index;

	void setValue(String name, int index, String[] tmp) {
		this.name = name;
		this.index = index;
		this.tmp = tmp;
	}

	void reserve() {
		tmp[index - 1] = name;
	}

}

class Cancel {
	String[] tmp;
	String name;

	void setValue(String name, String[] tmp) {
		this.name = name;
		this.tmp = tmp;
	}

	void cancel() {
		for (int i = 0; i < tmp.length; i++)
			if (name.equals(tmp[i])) {
				tmp[i] = "---";
				return;
			}
		System.out.println("없는 사람입니다.");
	}
}

public class Concert {
	static Scanner s = new Scanner(System.in);

	static boolean check_seat(int seat) {
		if (seat < 1 || seat > 3)
			return false;
		return true;
	}

	static boolean check_index(int index) {
		if (index < 1 || index > 10)
			return false;
		return true;
	}

	private static void print(String[] tmp) {
		for (int i = 0; i < tmp.length; i++)
			System.out.print(" " + tmp[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		String[] S = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" };
		String[] A = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" };
		String[] B = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" };

		String name;
		int index;

		Reserve r = new Reserve();
		Cancel c = new Cancel();

		System.out.println("명품콘서트홀 예약 시스템입니다.");

		while (true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int num = s.nextInt();

			if (num > 4 || num < 1) {
				System.out.println("없는 메뉴 입니다.");
				continue;
			}

			switch (num) {
			case 1:
				System.out.print("좌석구분 S(1), A(2), B(3)>>");
				int seat = s.nextInt();
				if (!check_seat(seat)) {
					System.out.println("없는 좌석입니다.");
					continue;
				}
				if (seat == 1) {
					System.out.print("S>>");
					print(S);

					System.out.print("이름>>");
					name = s.next();
					System.out.print("번호>>");
					index = s.nextInt();

					if (!check_index(index)) {
						System.out.println("없는 번호입니다.");
						continue;
					}

					r.setValue(name, index, S);
					r.reserve();
				}
				if (seat == 2) {
					System.out.print("A>>");
					print(A);

					System.out.print("이름>>");
					name = s.next();
					System.out.print("번호>>");
					index = s.nextInt();
					if (!check_index(index)) {
						System.out.println("없는 번호입니다.");
						continue;
					}

					r.setValue(name, index, A);
					r.reserve();
				}
				if (seat == 3) {
					System.out.print("B>>");
					print(B);

					System.out.print("이름>>");
					name = s.next();
					System.out.print("번호>>");
					index = s.nextInt();
					if (!check_index(index)) {
						System.out.println("없는 번호입니다.");
						continue;
					}

					r.setValue(name, index, B);
					r.reserve();
				}
				break;

			case 2:
				System.out.print("S>>");
				print(S);
				System.out.print("A>>");
				print(A);
				System.out.print("B>>");
				print(B);
				System.out.println("<<<조회를 완료하였습니다.>>>");
				break;

			case 3:
				System.out.print("좌석 S(1), A(2), B(3)>>");
				seat = s.nextInt();
				if (!check_seat(seat)) {
					System.out.println("없는 좌석입니다.");
					continue;
				}

				if (seat == 1) {
					System.out.print("S>>");
					print(S);

					System.out.print("이름>>");
					name = s.next();

					c.setValue(name, S);
					c.cancel();
					break;
				}
				if (seat == 2) {
					System.out.print("A>>");
					print(A);

					System.out.print("이름>>");
					name = s.next();

					c.setValue(name, A);
					c.cancel();
					break;
				}
				if (seat == 3) {
					System.out.print("B>>");
					print(B);

					System.out.print("이름>>");
					name = s.next();

					c.setValue(name, B);
					c.cancel();
					break;
				}
			case 4:
				return;
			}
		}
	}
}
