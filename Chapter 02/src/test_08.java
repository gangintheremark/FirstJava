import java.util.Scanner;

public class test_08 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.print("�� �� (x1,y1), (x2,y2)�� ��ǥ�� �Է��Ͻÿ� >>");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();

		if ((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200)) {
			System.out.print("�簢���� �浹�Ѵ�.");
		} else if ((x2 >= 100 && x2 < 200) && (y2 >= 100 && y2 <= 200)) {
			System.out.print("�簢���� �浹�Ѵ�.");
		} else if ((x1 <= 100 && x2 >= 200) && (y1 <= 100 && y2 >= 200)) {
			System.out.print("�簢���� �浹�Ѵ�.");
		} else
			System.out.print("�簢���� �浹���� �ʴ´�.");

		s.close();
	}
}
