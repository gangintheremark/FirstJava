import java.util.Scanner;

public class test_14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		while (true) {
			System.out.print("과목이름>>");
			String name = s.next();

			if (name.equals("그만"))
				break;

			int i = 0;
			for (; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.println(name + "의 점수는" + score[i]);
					break;
				}

			}
			if (i == 5)
				System.out.println("없는 과목입니다.");
		}

	}

}
