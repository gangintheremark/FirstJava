import java.util.Scanner;

public class test_06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		int money;
		System.out.print("�ݾ��� �Է��Ͻÿ�>");
		money = s.nextInt();

		System.out.println("50000�� ¥�� : " + money / unit[0] + "��");
		System.out.println("10000�� ¥�� : " + (money / unit[1] - (money / unit[0]) * 5) + "��");

		money %= unit[1];
		System.out.println("1000�� ¥�� : " + money / unit[2] + "��");

		money %= unit[2];
		System.out.println("500�� ¥�� : " + money / unit[3] + "��");
		System.out.println("100�� ¥�� : " + (money / unit[4] - (money / unit[3]) * 5) + "��");

		money %= unit[4];
		System.out.println("50�� ¥�� : " + money / unit[5] + "��");
		System.out.println("10�� ¥�� : " + (money / unit[6] - (money / unit[5]) * 5) + "��");

		System.out.println("1�� ¥�� : " + money % unit[6] + "��");
		s.close();

	}
}
