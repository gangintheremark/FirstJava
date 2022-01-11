package test_11;
import java.util.Scanner;

abstract class Calc {
	protected int a;
	protected int b;

	protected void setValue(int a, int b) {
		this.a = a;
		this.b =b;
	}

	abstract int calculate();
}

class Add extends Calc {
	@Override
	int calculate() {
		return a + b;
	}
}

class Sub extends Calc {
	@Override
	int calculate() {
		return a - b;
	}
}
class Mul extends Calc {
	@Override
	int calculate() {
		return a * b;
	}
}
class Div extends Calc {
	@Override
	int calculate() {
		return a / b;
	}
}
public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a = s.nextInt();
		int b = s.nextInt();
		String c = s.next();
		int result = 0;
		Calc cal = null;
		
		switch(c) {
		case "+":
			cal = new Add();
			break;
			
		case "-":
			cal = new Sub();
			break;
			
		case "*":
			cal = new Mul();
			break;
			
		case "/" :
			cal = new Div();
			break;
		}
		
		cal.setValue(a, b);
		result = cal.calculate();
		System.out.println(result);
		s.close();
	}
}
