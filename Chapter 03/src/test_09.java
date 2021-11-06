
public class test_09 {
	public static void main(String[] args) {
		int Array[][] = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				Array[i][j] = (int) (Math.random() * 10 + 1);

				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
