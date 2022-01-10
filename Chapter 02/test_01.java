import java.util.Scanner;

public class test_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("원화를 입력하세요(단위 원)>>");
		int money = s.nextInt();

		double dollor = (double) money / 1100.0;

		System.out.println(money + "원은 $" + dollor + "입니다");
		
		s.close();
	}
}
