package test_09;

import java.util.Scanner;

interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴

	int capacity(); // 스택의 전체 저장 가능한 개수 리턴

	String pop(); // 스택의 top에 실수 저장

	boolean push(String val); // 스택의 top에 저장된 실수 리턴
}

class StringStack implements Stack {
	private int num;
	private int index;
	private String[] Stack;

	public StringStack(int num) {
		this.num = num;
		this.index = 0;
		Stack = new String[num];
	}

	public int length() {
		return index;
	}

	public int capacity() {
		return Stack.length;
	}

	public String pop() {
		if (this.index == 0)
			return null;
		String tmp = Stack[index - 1];
		this.index--;
		return tmp;
	}

	public boolean push(String val) {
		if (index < num) {
			Stack[index] = val;
			index++;
			return true;
		} else
			return false;
	}
}

public class StringStackEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int n = s.nextInt();

		StringStack stack = new StringStack(n);

		while (true) {
			System.out.print("문자열 입력 >> ");
			String tmp = s.next();

			if (stack.capacity() == stack.length()) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
				break;
			}

			if (tmp.equals("그만"))
				break;

			stack.push(tmp);
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		while (true) {
			if (stack.length() == 0)
				break;

			System.out.print(stack.pop() + " ");
		}
		s.close();
	}
}
