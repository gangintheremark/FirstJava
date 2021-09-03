import java.util.Scanner;

public class test_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int r1 = s.nextInt();

		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		int r2 = s.nextInt();

		if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) <= r1 + r2)
			System.out.print("두 원은 서로 겹친다.");
		
		s.close();
	}
}
