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
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		
		Grade me = new Grade(math, science, english);
		
		System.out.println("평균은 " + me.average());
		
		s.close();
	}

}
