import java.util.Scanner;

public class test_06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int index = s.nextInt();

		int a = index / 10;
		int b = index % 10;

		if (a % 3 == 0)
			if (b % 3 == 0)
				System.out.println("박수짝짝");
			else
				System.out.print("박수짝");
		else if (b % 3 == 0)
			System.out.println("박수짝");

		s.close();

	}
}
