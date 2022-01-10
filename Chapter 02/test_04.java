import java.util.Scanner;

public class test_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("정수 3개 입력>>");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int mid = 0;

		if ((a >= b && b >= c) || (c >= b && b >= a))
			mid = b;
		else if ((b >= c && c >= a) || (a >= c && c >= b))
			mid = c;
		else if ((b >= a && a >= c) || (c >= a && a >= b))
			mid = a;

		System.out.println("중간 값은 " + mid);
		s.close();

	}
}
