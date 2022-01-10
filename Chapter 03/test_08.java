import java.util.Scanner;

public class test_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 몇개?");
		int n = s.nextInt();
		int data[] = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			data[i] = (int)(Math.random()*100 +1);
			
			for(int j=0;j<i;j++) {
				if(data[j] == data[i]) {
					i--;
					continue;
				}
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.print(data[i] + " ");

	}
}
