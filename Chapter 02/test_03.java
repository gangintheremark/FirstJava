import java.util.Scanner;

public class test_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = s.nextInt();

		System.out.println("�������� " + money / 50000 + "��");
		money %= 50000;

		System.out.println("������ " + money / 10000 + "��");
		money %= 10000;

		System.out.println("õ���� " + money / 1000 + "��");
		money %= 1000;

		System.out.println("��� " + money / 100 + "��");
		money %= 100;

		System.out.println("���ʿ� " + money / 50 + "��");
		money %= 50;

		System.out.println("�ʿ� " + money / 10 + "��");
		System.out.println("�Ͽ� " + money % 10 + "��");

		s.close();
	}
}
