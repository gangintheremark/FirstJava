import java.util.Scanner;

public class test_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char c = s.next().charAt(0);  //     charAt(); 

		for (int i = (int) c; i >= 97; i--) {
			for (char j = (char) 97; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
	}
}
