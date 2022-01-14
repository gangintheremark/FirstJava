package test_09;

import java.util.*;

public class GameEx {
	static Scanner s = new Scanner(System.in);

	static String toString(int tmp) {
		switch (tmp) {
		case 1:
			return "가위";
		case 2:
			return "바위";
		case 3:
			return "보";
		}
		return null;
	}

	static void print(String user, String computer) {

		System.out.println("철수(" + user + ")  :  컴퓨터(" + computer + ")");
	}

	static void print_win(String s) {
		System.out.println(s + "가 이겼습니다.");
	}

	static void play(int user, int computer) {

		if (computer == user) {
			System.out.println("비겼습니다.");
			return;
		}

		switch (user) {
		case 1:
			if (computer == 2) {
				print_win("컴퓨터");
				return;
			} else if (computer == 3) {
				print_win("철수");
				return;
			}
		case 2:
			if (computer == 1) {
				print_win("철수");
				return;
			} else if (computer == 3) {
				print_win("컴퓨터");
				return;
			}
		case 3:
			if (computer == 1) {
				print_win("컴퓨터");
				return;
			} else if (computer == 2) {
				print_win("철수");
				return;
			}
		}
	}

	static void run() {
		while (true) {
			System.out.print("철수 [가위(1), 바위(2), 보(3), 끝내기(4)] >> ");
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
