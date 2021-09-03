import java.util.Scanner;

public class test_06 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.print("1~99 »çÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À>>");
		int index = s.nextInt();

		if (index / 10 == 3 || index / 10 == 6 || index / 10 == 9) {
			if (index % 10 == 3 || index % 10 == 6 || index % 10 == 9)
				System.out.print("¹Ú¼öÂ¦Â¦");
			else
				System.out.print("¹Ú¼öÂ¦");
		}
		if (index % 10 == 3 || index % 10 == 6 || index % 10 == 9) {
			if (index / 10 == 3 || index / 10 == 6 || index / 10 == 9)
				System.out.print("¹Ú¼öÂ¦Â¦");
			else
				System.out.print("¹Ú¼öÂ¦");
		}
		s.close();
	}
}
