import java.util.Scanner;

public class test_06 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.print("1~99 ���� ������ �Է��Ͻÿ�>>");
		int index = s.nextInt();

		if (index / 10 == 3 || index / 10 == 6 || index / 10 == 9) {
			if (index % 10 == 3 || index % 10 == 6 || index % 10 == 9)
				System.out.print("�ڼ�¦¦");
			else
				System.out.print("�ڼ�¦");
		}
		if (index % 10 == 3 || index % 10 == 6 || index % 10 == 9) {
			if (index / 10 == 3 || index / 10 == 6 || index / 10 == 9)
				System.out.print("�ڼ�¦¦");
			else
				System.out.print("�ڼ�¦");
		}
		s.close();
	}
}
