import java.util.Scanner;

public class test_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int money = s.nextInt();

		double dollor = (double) money / 1100.0;

		System.out.println(money + "���� $" + dollor + "�Դϴ�");
		
		s.close();
	}
}
