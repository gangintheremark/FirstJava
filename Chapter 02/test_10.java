import java.util.Scanner;

public class test_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int x1= s.nextInt();
		int y1 = s.nextInt();
		double r1 = s.nextDouble();
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		double r2 = s.nextDouble();
		
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		if(distance > r1+r2)
			System.out.println("두 원은 서로 겹치지 않는다.");
		else
			System.out.println("두 원은 서로 겹친다.");
		
		
	}
}
