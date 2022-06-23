package _abstract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Today {

	public static void main(String[] args) throws ParseException{
		Date dt = new Date(); 
		System.out.println("오늘 날짜 : " + dt);
		System.out.println();
		
		//날짜 형식 변경하기
		SimpleDateFormat sdf = new SimpleDateFormat("Y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : " + sdf.format(dt));
		
		//입력
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
	
		//parse는 형변환 시켜줌 
		Date birth = input.parse("19950912052015"); //String -> date형식으로 변경해주어야 함
	
		System.out.println("내 생일 : " + birth);
		System.out.println("내 생일 : " + sdf.format(birth));
		
//	    Calendar cal = new Calendar();
//		Calendar cal = new GregorianCalendar(); // ---> 기준은 시스템 날짜와 시간.
		Calendar cal = Calendar.getInstance();
		
		//다른 나라 시간을 기준을 변경
//		Calender cal = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific"));
		
		int year = cal.get(1);
		int year2 = cal.get(Calendar.YEAR);
		int mont = cal.get(Calendar.MONTH)+1 ; //1월-0, 2월-1 3월-2
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		int week = cal.get(Calendar.DAY_OF_WEEK); //일-1, 월-2, 화-3~~ 토-7
		
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "Sunday"; break;
		case 2 : dayOfWeek = "Monday"; break;
		case 3 : dayOfWeek = "Tuesday"; break;
		case 4 : dayOfWeek = "Wednesday"; break;
		case 5 : dayOfWeek = "Thursday"; break;
		case 6 : dayOfWeek = "Friday"; break;
		case 7 : dayOfWeek = "Saturday"; break;
		
		
		}
		
		System.out.println(year + "." + mont + "." + day  + "." + dayOfWeek );
//1 --> Calendar.YEAR (상수)
		System.out.println(hour +"시 " + min + "분 "+ sec+ "초");
	}
}

