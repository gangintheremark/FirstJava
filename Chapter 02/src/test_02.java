import java.util.Scanner;

public class test_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("2�ڸ� �� ���� �Է�(10~99)>>");
		int index = s.nextInt();

		if (index / 10 == index % 10)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		s.close();
	}
}
