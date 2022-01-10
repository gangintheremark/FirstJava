import java.util.Scanner;

public class test_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("연산>>");
		int a = s.nextInt();
		String b = s.next();
		int c = s.nextInt();
		int result = 0;

		switch (b) {
		case "+":
			result = a + c;
			System.out.println(a + b + c + "의 계산결과는 " + result);
			break;
		case "-":
			result = a - c;
			System.out.println(a + b + c + "의 계산결과는 " + result);
			break;
		case "*":
			result = a * c;
			System.out.println(a + b + c + "의 계산결과는 " + result);
			break;
		case "/":
			if (c == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else {
				result = a / c;
				System.out.println(a + b + c + "의 계산결과는 " + result);
			}
			break;
		default:
			System.out.print("잘못입력하였습니다.");
		}

	}

}
