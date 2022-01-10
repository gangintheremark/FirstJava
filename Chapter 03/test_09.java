
public class test_09 {
	public static void main(String[] args) {
		int data[][] = new int[4][4];
		
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++)  {
				data[i][j] = (int)(Math.random()*10 + 1);
				System.out.print(data[i][j] + "    ");
			}
			System.out.println();
		}
	}
}
