import java.util.Scanner;

public class test_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		int data[] = new int[10];

		for (int i = 0; i < 10; i++)
			data[i] = s.nextInt();

		System.out.print("3�� ����� ");
		for (int i = 0; i < 10; i++) {
			if (data[i] % 3 == 0)
				System.out.print(data[i] + " ");
		}
	}
}