import java.util.Scanner;

public class test_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int x1= s.nextInt();
		int y1 = s.nextInt();
		double r1 = s.nextDouble();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		double r2 = s.nextDouble();
		
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		if(distance > r1+r2)
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		else
			System.out.println("�� ���� ���� ��ģ��.");
		
		
	}
}