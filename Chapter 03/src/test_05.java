import java.util.Scanner;

public class test_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int data[] = new int[10];

		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");

		for (int i = 0; i < 10; i++) {
			data[i] = s.nextInt();
		}

		System.out.print("3�� ����� ");

		for (int i = 0; i < 10; i++) {
			if (data[i] % 3 == 0)
				System.out.print(data[i] + " ");
		}
		s.close();
	}

}
