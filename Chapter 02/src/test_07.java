import java.util.Scanner;

public class test_07 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = s.nextInt();
		int y = s.nextInt();

		if (x >= 100 && x <= 200 && y >= 100 && y <= 200)
			System.out.print("(" + x + "," + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
		else
			System.out.print("(" + x + "," + y + ")�� �簢�� �ȿ� �����ϴ�.");

		s.close();
	}
}
