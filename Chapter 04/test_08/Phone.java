package test_08;

import java.util.Scanner;

public class Phone {
	private String name;
	private String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

class PhoneBook {
	static Scanner s = new Scanner(System.in);
	private static Phone phone[];

	public static void main(String[] args) {
		System.out.print("인원수>>");
		int index = s.nextInt();
		phone = new Phone[index];

		for (int i = 0; i < index; i++) {
			System.out.print("이름과 전화번호 (이름과 번호는 빈칸없이 입력)>>");
			String name = s.next();
			String tel = s.next();

			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");

		while (true) {
			System.out.print("검색할 이름 >>");
			String who = s.next();

			int i=0;
			for (; i < phone.length; i++) {
				if (who.equals(phone[i].getName())) {
					System.out.println(phone[i].getName() + "의 번호는 " + phone[i].getTel() + "입니다.");
					break;
				} else if (who.equals("그만"))
					return;
			}
			if (i == phone.length)
				System.out.println(who + "이 없습니다.");
		}
	}
}
