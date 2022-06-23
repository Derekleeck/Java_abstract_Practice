package _abstract;

import java.util.Calendar;
import java.util.Scanner;



class CalendarTest{
	private int year, month, lastDay, date;
	
	public CalendarTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		year = scan.nextInt();
		System.out.println("월 입력 : ");
		month = scan.nextInt();
		
	}
	
	public void calc() {
//		Calendar cal = new Calendar();
// 		subclass 이용하여 생성
		Calendar cal = Calendar.getInstance();//메소드 - 기준은 시스템 날짜
		
//		cal.set(Calendar.YEAR, year);
//		cal.set(Calendar.MONTH, month-1);
//		cal.set(DAY_OF_MONTH, 1);
		//기준을 원하는 날짜로 변경

//-----------------
		cal.set(year,  month-1, 1);
		date = cal.get(Calendar.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //28, 29, 30, 31
		
	}
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<date; i++) {
			System.out.print("\t");
		}
		for(int i = 1; i<=lastDay; i++) {
			System.out.print(i + "\t");
			if(date%7 == 0) System.out.println();
			date++;
			}
		}
	}

/////////////////////
public class CalendarMain{
	public static void main(String[] args) {
		CalendarTest ct = new CalendarTest();
		ct.calc();
		ct.display();
	}
}


/*
[문제] 만년달력
1. 년, 월을 입력하여 달력을 출력하시오
2. 클래스 : CalendarTest
   필드
   생성자 : 입력
   메소드 : calc() -> 월마다 끝나는 일(28, 29, 30, 31)을 구하기
                  -> 월마다 시작하는 요일을 구하기
           display()

[실행결과]
년도 입력 : 2002
월 입력 : 10

(0)(1)(2)(3)(4)(5)(6)(7)
일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31

 */


