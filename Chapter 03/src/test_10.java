
public class test_10 {
	public static void main(String[] args) {
		int Array[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		int count = 0;

		while (count < 10) {
			int i = (int) (Math.random()*4);
			int j = (int) (Math.random() * 4);

			if (Array[i][j] == 0) {
				Array[i][j] = (int) (Math.random() * 10 + 1);
				count++;
			} 
		}
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				System.out.printf("%d ", Array[i][j]);
			}
			System.out.println();
		}
	}
}
