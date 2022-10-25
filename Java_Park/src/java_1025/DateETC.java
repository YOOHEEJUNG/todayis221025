package java_1025;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateETC {
	
	public static void main(String[] args) {
		
		//날짜와 시간을 다른 형태로 사용하는 클래스
		Calendar calendar = new GregorianCalendar();
		//Date보다 많은 정보를 출력(현재 시간에 대한 정보)
		System.out.println(calendar);
		
		//특정한 데이터를 조회 - 현재 년도 추출
		System.out.println(calendar.get(Calendar.YEAR));
		
		//최근에 많이 사용하는 날짜 타입 (빨간 줄 안 나옴)
		LocalDateTime meetingTime = LocalDateTime.of(2022, 10, 31, 13, 34);
		System.out.println(meetingTime);
		//Date와 Calendar은 월-1 (0부터 시작해서)
		//LocalDateTimt은 월 그대로 써도 됨
	
	}
	

}
