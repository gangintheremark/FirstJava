import java.util.Scanner;

public class test_09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		int x = s.nextInt();
		int y = s.nextInt();
		double r = s.nextDouble();
		
		System.out.print("�� �Է�>>");
		int x1=s.nextInt();
		int y1 = s.nextInt();
		
		double distance = Math.sqrt(((x1-x)*(x1-x))+((y1-y)*(y1-y)));
		
		if(distance <= r)
			System.out.print("�� ("+ x1 +", " +y1 + ") �� �� �ȿ� �ִ�.");
		else
			System.out.print("�� ("+ x1 +", " +y1 + ") �� �� �ȿ� ����.");
			
	}
}
