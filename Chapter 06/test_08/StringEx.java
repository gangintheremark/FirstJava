package test_08;
import java.util.*;

public class StringEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String str = s.nextLine();
		
		for(int i=0;i<=str.length();i++) {
			System.out.print(str.substring(i));
			System.out.println(str.substring(0,i));
		}
	}

}
