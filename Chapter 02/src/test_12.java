import java.util.Scanner;

public class test_12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("����>>");
		int a = s.nextInt();

		String op = s.next();

		int b = s.nextInt();
		int res = 0;

		if (op.equals("+"))
			res = a + b;
		else if (op.equals("-"))
			res = a - b;
		else if (op.equals("*"))
			res = a * b;
		else if (op.equals("/")) {
			if (b == 0) {
				System.out.print("0���� ���� �� �����ϴ�.");
				return;
			} else
				res = a / b;
		}
		System.out.println(a + op + b + "�� ��� ����� " + res);

		s.close();
	}
}
