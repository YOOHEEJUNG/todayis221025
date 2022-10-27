package naver.com.bytefileprocessing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		//바이트 단위로 파일에 기록하기
		try {
			
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm");
			
			//기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream("./" + sdf.format(date) + ".txt");
			
			
//			File fos1 = new File(".");
//			String abpath = fos1.getAbsolutePath();
			
			//기록할 메시지 생성
			String msg = "점심시간까지 아직 많이 남았네요..";
			
			//파일에 기록
			fos.write(msg.getBytes());
			
			//파일 닫기
			fos.close();
			
			
		//어떤 문제가 생겼는지 알 수 있게 기술	
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		//앞에서 작성한 파일 읽기
		try {
			//읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("./2022-10-27-11-44.txt");
			//읽어서 저장할 바이트 배열을 생성
			byte [] b = new byte[fis.available()];
			//읽기
			fis.read(b);
			//읽기 내용 확인
			System.out.println(new String(b));
			//읽기 닫기
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		

	}

}
