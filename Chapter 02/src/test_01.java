import java.util.Scanner;

public class test_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("원화를 입력하세요(단위 원)>>");
		int price = scanner.nextInt();
		double dollor = price / 1100.0;

		System.out.println(price + "원은 $" + dollor + "입니다.");

		scanner.close();
	}
}