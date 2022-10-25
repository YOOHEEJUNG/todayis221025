package java_1025;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {

	public static void main(String[] args) {
		//현재 시간을 갖는 java.util.Date 인스턴스 생성
		Date currentTime = new Date();
		//출력 - 년월일 시분초 출력
		System.out.println(currentTime);
		
		//원하는 날짜를 가지고 생성: 2002년 8월 23일 14:42:00로 설정
		Date myBroBirth = new Date(102, 7, 23, 14, 42, 0);
		//출력 - 년월일 시분초 출력
		System.out.println(myBroBirth);

		//년도만 추출해서 출력
		System.out.println(myBroBirth.getYear()+1900);
		
		//원하는 포맷으로 출력
		//1986년 5월 5일 ?요일이라고 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(sdf.format(myBroBirth));
		
		//연습해볼만한 과제 - 년월일을 비교해서 년월일이 같으면 시간과 분
		//             - 년월일이 같지 않으면 년월일을 출력
		//현재시각
		Date cT = new Date();
		System.out.println(cT);
		
		//친구 생일
		Date myFB = new Date(97, 8, 24, 6, 24, 0);
		System.out.println(myFB);
		
		//97년 당시
		Date pT = new Date(97, 8, 24, 12, 0, 0);
		
		
		if(cT.getYear() == myFB.getYear() ) {
			
		}
	}
}
