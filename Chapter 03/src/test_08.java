import java.util.Scanner;

public class test_08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("정수 몇개?");
		int index = s.nextInt();
		int[] data = new int[100];

		for (int i = 0; i < index; i++) {
			data[i] = (int) (Math.random() * 100 + 1);

			for (int j = 0; j < i; j++) {
				if (data[i] == data[j])
					data[j] = (int) (Math.random() * 100 + 1);
			}
		}

		for (int i = 0; i < index; i++)
			System.out.print(data[i] + " ");
	}
}
