import java.util.Scanner;

public class test_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if((a+b>c) && (a+c>b) &&(b+c>a))
			System.out.println("�ﰢ���� �˴ϴ�.");
		else
			System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");
		
		s.close();
	}
}
