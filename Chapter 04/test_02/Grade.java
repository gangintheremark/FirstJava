package test_02;
import java.util.Scanner;

public class Grade {
	int a,b,c;
	
	public Grade(int a, int b, int c) {
		this.a=a; this.b=b; this.c=c;
	}
	public double average() {
		return (a+b+c)/3.0;
	}
	
	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		
		Grade me = new Grade(math, science, english);
		
		System.out.println("����� " + me.average());
		
		s.close();
	}

}
