package test_10;

import java.util.*;

class Person {
	public String name = new String();

	public String getName() {
		return name;
	}

	public boolean equalNumber(int[] data) {
		if (data[0] == data[1] && data[1] == data[2] && data[0] == data[2])
			return true;
		return false;
	}
}

public class PersonGameEx {

	static Person p1 = new Person();
	static Person p2 = new Person();
	static Scanner s = new Scanner(System.in);

	static boolean run(Person p) {

		System.out.println("[" + p.getName() + "]:<Enter>");
		String str = s.nextLine();
		int data[] = new int[3];
		for (int i = 0; i < 3; i++) {
			data[i] = (int) (Math.random() * 3 + 1);
			System.out.print("\t" + data[i]);
		}
		if (p.equalNumber(data)) {
			System.out.print("\t" + p.getName() + "���� �̰���ϴ�!");

			return true;
		} else {
			System.out.println("\t�ƽ�����!");
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.print("1��° ���� �̸�>>");
		p1.name = s.next();
		System.out.print("2��° ���� �̸�>>");
		p2.name = s.next();
		while (true) {
			if (run(p1))
				break;
			if (run(p2))
				break;
		}
	}
}
