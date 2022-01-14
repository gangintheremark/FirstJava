package test_06;

import java.util.*;

public class TimeGame {

	static Calendar now;
	static Calendar after;
	static Scanner s = new Scanner(System.in);

	static void print(int result1, int result2) {
		System.out.print(
				"Ȳ������ ��� " + result1 + ", ���繮�� ��� " + result2+ "  ���ڴ� ");
		if(result1> result2)
			System.out.println("���繮");
		else
			System.out.println("Ȳ����");
	}
	
	static public int run(String user) {
		System.out.print(user + "���� <Enter>Ű >> ");
		String enter = s.nextLine();
		now = Calendar.getInstance();
		int second = now.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + second);

		System.out.print("10�� ���� �� <Enter>Ű >> ");
		String enter2 = s.nextLine();
		after = Calendar.getInstance();
		int second2 = after.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + second2);

		int result = Math.abs(second - second2);
		return result;

	}

	public static void main(String[] args) {

		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		
		print(run("Ȳ����"), run("���繮"));


	}

}
