package test_07;
import java.util.*;

public class StringTokenEx {
	
	static void stringToken(String str) {
		StringTokenizer token = new StringTokenizer(str, " ");
		int n = token.countTokens();
		System.out.println("���� ������ "+ n);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
		System.out.print(">>");
		String str = s.nextLine();
		
		if(str.equals("�׸�")) {
			System.out.println("�����մϴ�...");
			break;
		}
		
		stringToken(str);
		}
		s.close();
	}

}
