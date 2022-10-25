package java_1025;

import java.util.ArrayList;
import java.util.LinkedList;

//데이터 조회
public class CollectionTest3 {
	
	public static void main(String[] args) {
		//100000개의 데이터를 가진 ArrayList
		ArrayList <Integer> al = new ArrayList();
		for(int i = 0; i < 100000; i++) {
			al.add(i);
		}
		
		////////////////////////////////////////////////////
		
		//100000개의 데이터를 가진 LinkedList 생성
		LinkedList <Integer> ll = new LinkedList();
		for(int i = 0; i < 100000; i++) {
			ll.add(i);
		}
		
		/////////////////////////////////////////////////////
		
		//ArrayList에서 100000개의 데이터를 읽는데 걸리는 시간
		//데이터를 가져오는 메서드는 get(인덱스)
		//실행해서 가장 마지막에 나오는 숙자를 확인한 후 al을 ll로 변경해서 실행하고 숫자 확인
		long start = System.currentTimeMillis();
		for(int i = 0; i <100000; i++) {
			System.out.println(al.get(i));
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		System.out.println(al);
		
		
		
	}

}
