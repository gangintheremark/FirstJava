import java.util.Scanner;

public class test_09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("���� �߽ɰ� ������ �Է�>>");
		int xc = s.nextInt();
		int yc = s.nextInt();
		double r = s.nextDouble();

		System.out.print("�� �Է�>>");
		double x = s.nextDouble();
		double y = s.nextDouble();

		if (Math.sqrt((x - xc) * (x - xc) + (y - yc) * (y - yc)) <= r)
			System.out.print("�� (" + x + ", " + y + ")�� �� �ȿ� �ִ�.");
		else
			System.out.print("�� (" + x + ", " + y + ")�� �� �ȿ� ��.��.");

		s.close();
	}
}
