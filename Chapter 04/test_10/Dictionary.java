package test_10;

import java.util.Scanner;

public class Dictionary {

	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		int i = 0;
		for (; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				return eng[i];
			}
		}
		return  "���� ������ �����ϴ�.";
	}

	public static void main(String[] args) {
		System.out.println("�ѿ��ܾ� �˻� ���α׷�.");
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("�ѱ� �ܾ�?");
			String word = s.next();
			
			if(word.equals("�׸�"))
				break;
			
			System.out.println(word +"�� " + kor2Eng(word));

		}
	}

}
