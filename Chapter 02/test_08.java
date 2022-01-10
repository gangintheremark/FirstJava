import java.util.Scanner;

public class test_08 {
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		
		boolean a = inRect(x1,y1, 100,100,200,200);
		boolean b = inRect(x2,y2, 100,100,200,200);
		
		if(a || b)
			System.out.println("직사각형과 충돌합니다.");
		else
			System.out.println("직사각형과 충돌하지 않습니다.");
	}
}
