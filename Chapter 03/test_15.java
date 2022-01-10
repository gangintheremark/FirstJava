import java.util.InputMismatchException;
import java.util.Scanner;

public class test_15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				int n = s.nextInt();
				int m = s.nextInt();

				System.out.print(n + "x" + m + "=" + n * m);
				break;
			} catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				s.nextLine(); // 이미 입력된 키를 모두 제거
			}
		}
	}
}
