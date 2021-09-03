import java.util.Scanner;

public class test_05 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.print("정수 3개를 입력하시오>>");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a + b > c && b + c > a && a + c > b)
			System.out.print("삼각형이 됩니다.");
		else
			System.out.print("삼각형이 되지 않습니다.");

		s.close();
	}

}
