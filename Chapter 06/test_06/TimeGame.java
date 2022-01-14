package test_06;

import java.util.*;

public class TimeGame {

	static Calendar now;
	static Calendar after;
	static Scanner s = new Scanner(System.in);

	static void print(int result1, int result2) {
		System.out.print(
				"황기태의 결과 " + result1 + ", 이재문의 결과 " + result2+ "  승자는 ");
		if(result1> result2)
			System.out.println("이재문");
		else
			System.out.println("황기태");
	}
	
	static public int run(String user) {
		System.out.print(user + "시작 <Enter>키 >> ");
		String enter = s.nextLine();
		now = Calendar.getInstance();
		int second = now.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + second);

		System.out.print("10초 예상 후 <Enter>키 >> ");
		String enter2 = s.nextLine();
		after = Calendar.getInstance();
		int second2 = after.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + second2);

		int result = Math.abs(second - second2);
		return result;

	}

	public static void main(String[] args) {

		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		
		print(run("황기태"), run("이재문"));


	}

}
