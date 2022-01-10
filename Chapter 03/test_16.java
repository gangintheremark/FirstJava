import java.util.Scanner;

public class test_16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };

		System.out.println("컴퓨터와 가위바위보 게임을 합니다.");

		while (true) {
			System.out.print("가위 바위 보!>>");
			String user = s.next();

			if (user.equals("그만"))
				break;

			int n = (int)(Math.random() * 3);

			if (str[n].equals("가위")) {
				if (user.equals("가위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
				else if (user.equals("바위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				else if (user.equals("보"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
			}
			if (str[n].equals("바위")) {
				if (user.equals("가위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
				else if (user.equals("바위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
				else if (user.equals("보"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
			}
			if (str[n].equals("보")) {
				if (user.equals("가위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
				else if (user.equals("바위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
				else if (user.equals("보"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
			}

		}

	}
}
