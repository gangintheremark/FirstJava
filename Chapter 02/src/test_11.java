import java.util.Scanner;

public class test_11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("달을 입력하세요(1~12)>>");
		int month = s.nextInt();

		if (month == 3 || month == 4 || month == 5)
			System.out.print("봄");
		else if (month == 6 || month == 7 || month == 8)
			System.out.print("여름");
		else if (month == 9 || month == 10 || month == 11)
			System.out.print("가을");
		else
			System.out.print("겨울");

		s.close();
	}

}
