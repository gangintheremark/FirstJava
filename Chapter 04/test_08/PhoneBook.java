package test_08;

import java.util.Scanner;

class Phone {
	String name;
	String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

}
public class PhoneBook {
	static Phone myphone[];
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("�ο���>>");
		int num  = s.nextInt();
		
			myphone= new Phone[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("�̸��� ��ȭ��ȣ>>");
			String name = s.next();
			String tel = s.next();
			
			myphone[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		while(true) {
		System.out.print("�˻��� �̸�>>");
		String sname = s.next();
		
		if(sname.equals("�׸�"))
			break;
		
		int i=0;
		for(;i<num;i++) {
			if(sname.equals(myphone[i].name)) {
				System.out.println(sname + "�� ��ȣ�� " + myphone[i].tel +"�Դϴ�.");
				break;
			}
		}
		if(i==num) 
			System.out.println(sname + "�� �����ϴ�.");
		}
	}
	
	
}
