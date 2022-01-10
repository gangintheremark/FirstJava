package test_10;

import java.util.Scanner;

public class Dictionary {

	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		int i = 0;
		for (; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				return eng[i];
			}
		}
		return  "저의 사전에 없습니다.";
	}

	public static void main(String[] args) {
		System.out.println("한영단어 검색 프로그램.");
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("한글 단어?");
			String word = s.next();
			
			if(word.equals("그만"))
				break;
			
			System.out.println(word +"는 " + kor2Eng(word));

		}
	}

}
