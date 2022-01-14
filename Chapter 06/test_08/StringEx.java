package test_08;
import java.util.*;

public class StringEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String str = s.nextLine();
		
		for(int i=0;i<=str.length();i++) {
			System.out.print(str.substring(i));
			System.out.println(str.substring(0,i));
		}
	}

}
