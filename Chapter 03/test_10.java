
public class test_10 {
	public static void main(String[] args) {
		int data[][] = new int[4][4];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = (int) (Math.random() * 10 + 1);
			}
		}

		for (int k = 0; k < 6; k++) {
			int i = (int) (Math.random() * 4 );
			int j = (int) (Math.random() * 4 );
			
			if (data[i][j] == 0) {
				k--;
				continue;
			}
			data[i][j] = 0;

		}

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "    ");
			}
			System.out.println();
		}

	}
}
