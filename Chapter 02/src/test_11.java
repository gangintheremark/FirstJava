import java.util.Scanner;

public class test_11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month = s.nextInt();

		if (month == 3 || month == 4 || month == 5)
			System.out.print("��");
		else if (month == 6 || month == 7 || month == 8)
			System.out.print("����");
		else if (month == 9 || month == 10 || month == 11)
			System.out.print("����");
		else
			System.out.print("�ܿ�");

		s.close();
	}

}
