import java.util.Scanner;

public class test_16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str[] = { "����", "����", "��" };

		System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�.");

		while (true) {
			System.out.print("���� ���� ��!>>");
			String user = s.next();

			if (user.equals("�׸�"))
				break;

			int n = (int)(Math.random() * 3);

			if (str[n].equals("����")) {
				if (user.equals("����"))
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				else if (user.equals("����"))
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
				else if (user.equals("��"))
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
			}
			if (str[n].equals("����")) {
				if (user.equals("����"))
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				else if (user.equals("����"))
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				else if (user.equals("��"))
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
			}
			if (str[n].equals("��")) {
				if (user.equals("����"))
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
				else if (user.equals("����"))
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				else if (user.equals("��"))
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
			}

		}

	}
}
