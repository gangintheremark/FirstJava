import java.util.Scanner;

public class test_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String a = s.next();
		char c = a.charAt(0);

		for (int i = 0; i <= c - 'a'; i++) {
			for (char j = 'a'; j <= c - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
