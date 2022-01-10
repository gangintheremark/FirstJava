import java.util.Scanner;

public class test_06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int index = s.nextInt();

		int a = index / 10;
		int b = index % 10;

		if (a % 3 == 0)
			if (b % 3 == 0)
				System.out.println("�ڼ�¦¦");
			else
				System.out.print("�ڼ�¦");
		else if (b % 3 == 0)
			System.out.println("�ڼ�¦");

		s.close();

	}
}
