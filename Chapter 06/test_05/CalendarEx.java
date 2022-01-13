package test_05;
import java.util.Calendar;

public class CalendarEx {

	public static void print(String msg,Calendar cal) {
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		
		System.out.println(msg + hour + "시 " + minute + "분입니다.");
		
		if(hour>=4 && hour<12)
			System.out.println("Good Morning");
		else if (hour>=12 && hour<18)
			System.out.println("Good Afternoon");
		else if(hour>=18 && hour<22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		print("현재 시간은 ", now);

	}

}
