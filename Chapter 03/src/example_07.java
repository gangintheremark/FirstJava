import java.util.Scanner;

public class example_07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;

		System.out.println("��� 5���� �Է��Ͻÿ�.");
		for (int i = 0; i < 5; i++) {
			intArray[i] = s.nextInt();

			if (max < intArray[i])
				max = intArray[i];

		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		s.close();
	}
}
