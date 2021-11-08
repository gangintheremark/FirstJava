package test_10;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++)
			if (word.equals(kor[i]))
				return eng[i];

		return "없습니다.";
	}
}

public class DicApp {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("한영 단어 검색 프로그램입니다.");

		while (true) {
			System.out.print("한글 단어?");

			String command = s.next();

			if (command.equals("그만"))
				break;

			String result = Dictionary.kor2Eng(command);

			if (result.equals("없습니다."))
				System.out.println(command + "는 저의 사전에 없습니다.");
			else
				System.out.println(command + "는 " + result);

		}
	}

}
