import java.util.Scanner;

public class test_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("정수 3개 입력>>");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int result = (a > b) ? ((b > c) ? b : ((a > c) ? c : a)) : ((a > c) ? a : ((b > c) ? c : b));

		System.out.print("중간 값은 " + result);

		s.close();
	}
}
