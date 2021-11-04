import java.util.Scanner;

public class test_06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		int money;
		System.out.print("금액을 입력하시오>");
		money = s.nextInt();

		System.out.println("50000원 짜리 : " + money / unit[0] + "개");
		System.out.println("10000원 짜리 : " + (money / unit[1] - (money / unit[0]) * 5) + "개");

		money %= unit[1];
		System.out.println("1000원 짜리 : " + money / unit[2] + "개");

		money %= unit[2];
		System.out.println("500원 짜리 : " + money / unit[3] + "개");
		System.out.println("100원 짜리 : " + (money / unit[4] - (money / unit[3]) * 5) + "개");

		money %= unit[4];
		System.out.println("50원 짜리 : " + money / unit[5] + "개");
		System.out.println("10원 짜리 : " + (money / unit[6] - (money / unit[5]) * 5) + "개");

		System.out.println("1원 짜리 : " + money % unit[6] + "개");
		s.close();

	}
}
