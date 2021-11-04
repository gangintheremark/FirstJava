import java.util.Scanner;

public class test_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int data[] = new int[10];

		System.out.print("양의 정수 10개를 입력하시오>>");

		for (int i = 0; i < 10; i++) {
			data[i] = s.nextInt();
		}

		System.out.print("3의 배수는 ");

		for (int i = 0; i < 10; i++) {
			if (data[i] % 3 == 0)
				System.out.print(data[i] + " ");
		}
		s.close();
	}

}
