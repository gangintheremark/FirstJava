import java.util.Scanner;

public class test_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int price = scanner.nextInt();
		double dollor = price / 1100.0;

		System.out.println(price + "���� $" + dollor + "�Դϴ�.");

		scanner.close();
	}
}