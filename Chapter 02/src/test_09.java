import java.util.Scanner;

public class test_09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("원의 중심과 반지름 입력>>");
		int xc = s.nextInt();
		int yc = s.nextInt();
		double r = s.nextDouble();

		System.out.print("점 입력>>");
		double x = s.nextDouble();
		double y = s.nextDouble();

		if (Math.sqrt((x - xc) * (x - xc) + (y - yc) * (y - yc)) <= r)
			System.out.print("점 (" + x + ", " + y + ")는 원 안에 있다.");
		else
			System.out.print("점 (" + x + ", " + y + ")는 원 안에 없.다.");

		s.close();
	}
}
