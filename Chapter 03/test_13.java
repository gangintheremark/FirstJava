
public class test_13 {
	public static void main(String[] args) {

		int num = 1;

		while (num < 100) {
			int a = num % 3;
			int b = num / 3;

			if (a == 0) {
				System.out.print(num + " ¹Ú¼öÂ¦");
				if (b % 3 == 0) {
					System.out.print("Â¦");
				}
			}
			num++;
			System.out.println();
		}
	}
}
