import java.util.Scanner;

public class test_08 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.print("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오 >>");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();

		if ((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200)) {
			System.out.print("사각형이 충돌한다.");
		} else if ((x2 >= 100 && x2 < 200) && (y2 >= 100 && y2 <= 200)) {
			System.out.print("사각형이 충돌한다.");
		} else if ((x1 <= 100 && x2 >= 200) && (y1 <= 100 && y2 >= 200)) {
			System.out.print("사각형이 충돌한다.");
		} else
			System.out.print("사각형이 충돌하지 않는다.");

		s.close();
	}
}
