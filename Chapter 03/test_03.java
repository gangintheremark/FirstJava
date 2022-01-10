import java.util.Scanner;

public class test_03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("정수를 입력하시오>>");
		int index = s.nextInt();

		for (int i = 0; i < index; i++) {
			for (int j = 0; j < index - i; j++)
				System.out.print("*");

			System.out.println();
		}
	}
}
