package test_11;

import java.util.Scanner;

class Add {
	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a+b;
	}
}

class Sub {
	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a-b;
	}
}

class Mul {
	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a*b;
	}
}

class Div {
	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a/b;
	}
}

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = s.nextInt();
		int b = s.nextInt();
		String c = s.next();
		int result = 0;
		
		switch(c) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			result = add.calculate();
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			result = sub.calculate();
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			result = mul.calculate();
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			result = div.calculate();
			break;
		}
		
		System.out.println(result);
	}
}
