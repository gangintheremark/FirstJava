import java.util.Scanner;

public class test_14 {
	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("���� �̸�>>");
			String name = s.next();

			if (name.equals("�׸�"))
				break;

			int i = 0;
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.println(name + "�� ������ " + score[i]);
					break;
				}
			}
			if (i == course.length)
				System.out.println("���� �����Դϴ�.");

		}
	}
}
