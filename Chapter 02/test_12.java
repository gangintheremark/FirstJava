import java.util.Scanner;

public class test_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("����>>");
		int a = s.nextInt();
		String b = s.next();
		int c = s.nextInt();
		int result = 0;

		switch (b) {
		case "+":
			result = a + c;
			System.out.println(a + b + c + "�� ������� " + result);
			break;
		case "-":
			result = a - c;
			System.out.println(a + b + c + "�� ������� " + result);
			break;
		case "*":
			result = a * c;
			System.out.println(a + b + c + "�� ������� " + result);
			break;
		case "/":
			if (c == 0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else {
				result = a / c;
				System.out.println(a + b + c + "�� ������� " + result);
			}
			break;
		default:
			System.out.print("�߸��Է��Ͽ����ϴ�.");
		}

	}

}
