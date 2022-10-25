package java_1025;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest2 {

	public static void main(String[] args) {
		
		//문자열을 저장하는 ArrayList 생성
		ArrayList <String> al = new ArrayList<>();
		
		//데이터 추가
		al.add("집에 언제 가?");
		al.add("1시간 30분 뒤에");
		
		Long start = System.currentTimeMillis();
		//새로운 데이터
		for(int i = 0; i < 110000; i++) {
			al.add(2, "지금 갈래");
		}
		Long end = System.currentTimeMillis();
		//ArrayList 작업 걸리는 시간
		System.out.println(end - start);
		
		/////////////////////////////////////////////////////
		
		LinkedList <String> ll = new LinkedList<>();
		
		//데이터 추가
		ll.add("집에 언제 가?");
		ll.add("1시간 30분 뒤에");
		
		start = System.currentTimeMillis();
		//새로운 데이터
		for(int i = 0; i < 110000; i++) {
			ll.add(2, "지금 갈래");
		}
		end = System.currentTimeMillis();
		//LikedList 작업 걸리는 시간
		System.out.println(end - start);
			
	                         
	}
}
