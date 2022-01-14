package test_07;
import java.util.*;

public class StringTokenEx {
	
	static void stringToken(String str) {
		StringTokenizer token = new StringTokenizer(str, " ");
		int n = token.countTokens();
		System.out.println("어절 개수는 "+ n);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
		System.out.print(">>");
		String str = s.nextLine();
		
		if(str.equals("그만")) {
			System.out.println("종료합니다...");
			break;
		}
		
		stringToken(str);
		}
		s.close();
	}

}
