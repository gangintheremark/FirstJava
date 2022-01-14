package test_09;

import java.util.*;

public class GameEx {
	static Scanner s = new Scanner(System.in);

	static String toString(int tmp) {
		switch (tmp) {
		case 1:
			return "����";
		case 2:
			return "����";
		case 3:
			return "��";
		}
		return null;
	}

	static void print(String user, String computer) {

		System.out.println("ö��(" + user + ")  :  ��ǻ��(" + computer + ")");
	}

	static void print_win(String s) {
		System.out.println(s + "�� �̰���ϴ�.");
	}

	static void play(int user, int computer) {

		if (computer == user) {
			System.out.println("�����ϴ�.");
			return;
		}

		switch (user) {
		case 1:
			if (computer == 2) {
				print_win("��ǻ��");
				return;
			} else if (computer == 3) {
				print_win("ö��");
				return;
			}
		case 2:
			if (computer == 1) {
				print_win("ö��");
				return;
			} else if (computer == 3) {
				print_win("��ǻ��");
				return;
			}
		case 3:
			if (computer == 1) {
				print_win("��ǻ��");
				return;
			} else if (computer == 2) {
				print_win("ö��");
				return;
			}
		}
	}

	static void run() {
		while (true) {
			System.out.print("ö�� [����(1), ����(2), ��(3), ������(4)] >> ");
			int user = s.nextInt();

			if (user == 4)
				break;
			int computer = (int) (Math.random() * 3 + 1);

			print(toString(user), toString(computer));
			play(user, computer);
		}
	}

	public static void main(String[] args) {
		run();

	}

}
