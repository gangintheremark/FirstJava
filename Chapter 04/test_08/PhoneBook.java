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
		System.out.print("인원수>>");
		int num  = s.nextInt();
		
			myphone= new Phone[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("이름과 전화번호>>");
			String name = s.next();
			String tel = s.next();
			
			myphone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
		System.out.print("검색할 이름>>");
		String sname = s.next();
		
		if(sname.equals("그만"))
			break;
		
		int i=0;
		for(;i<num;i++) {
			if(sname.equals(myphone[i].name)) {
				System.out.println(sname + "의 번호는 " + myphone[i].tel +"입니다.");
				break;
			}
		}
		if(i==num) 
			System.out.println(sname + "이 없습니다.");
		}
	}
	
	
}
