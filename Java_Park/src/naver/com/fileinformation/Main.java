package naver.com.fileinformation;

import java.io.File;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//파일에 대한 정보 확인
		
		try {
			//File 인스턴스 생성
			//Windows에서는 디렉터리 구분 기호가 \인데
			//프로그래밍 언어에서는 \가 오고 하나의 문자가 오면 제어문자로 인식
			//\을 입력하고자 할 때는 \\ 이렇게 해야 함
			File f = new File("C:\\Users\\user\\Desktop\\1026_.txt");
			
			//파일의 존재 여부 확인
			System.out.println(f.exists());
			
			//마지막 수정 날짜 확인
			System.out.println(f.lastModified());
			System.out.println(new Date(f.lastModified()));
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());	
		}
		
		
	}

}
