import java.util.Scanner;

public class test_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n;
		System.out.print("������ �Է��Ͻÿ�>>");
		n = s.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--)
				System.out.print("*");
			System.out.println();

		}

	}
}
