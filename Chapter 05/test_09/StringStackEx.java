package test_09;

import java.util.Scanner;

interface Stack {
	int length(); // ���� ���ÿ� ����� ���� ����

	int capacity(); // ������ ��ü ���� ������ ���� ����

	String pop(); // ������ top�� �Ǽ� ����

	boolean push(String val); // ������ top�� ����� �Ǽ� ����
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

		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int n = s.nextInt();

		StringStack stack = new StringStack(n);

		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String tmp = s.next();

			if (stack.capacity() == stack.length()) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
				break;
			}

			if (tmp.equals("�׸�"))
				break;

			stack.push(tmp);
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		while (true) {
			if (stack.length() == 0)
				break;

			System.out.print(stack.pop() + " ");
		}
		s.close();
	}
}
