import java.util.Scanner;

public class test_09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		int x = s.nextInt();
		int y = s.nextInt();
		double r = s.nextDouble();
		
		System.out.print("점 입력>>");
		int x1=s.nextInt();
		int y1 = s.nextInt();
		
		double distance = Math.sqrt(((x1-x)*(x1-x))+((y1-y)*(y1-y)));
		
		if(distance <= r)
			System.out.print("점 ("+ x1 +", " +y1 + ") 는 원 안에 있다.");
		else
			System.out.print("점 ("+ x1 +", " +y1 + ") 는 원 안에 없다.");
			
	}
}
