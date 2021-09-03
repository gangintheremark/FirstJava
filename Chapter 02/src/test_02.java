import java.util.Scanner;

public class test_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("2자리 수 정수 입력(10~99)>>");
		int index = s.nextInt();

		if (index / 10 == index % 10)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		s.close();
	}
}
