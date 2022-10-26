package naver.com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
	public static void main(String[] args) {
		
		//HashMap 인스턴스 생성
		Map<String, Object> map = new HashMap<>();
		
		map.put("num", 1);
		map.put("name", "정원");
		map.put("age", 29);
		map.put("major", "history");
		//동일한 key에 데이터를 저장하면 이전 데이터가 삭제되고 수정
		map.put("major", "language");
		
		//전체 데이터 확인
		System.out.println(map);
		
		//Map에서 데이터 가져오기
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		//존재하지 않는 key를 사용하면 자바는 null을 리턴
		System.out.println(map.get("subject"));
		
		map.remove("major");
		System.out.println(map);
		
		//Map을 이용하면 key의 이름을 몰라도 모든 데이터를 접근하는 것이 가능(가장 큰 장점)	
		Set<String> keys = map.keySet();
		//set을 순회
		for(String key : keys) {
			//key를 순회하면서 key에 저장된 value를 확인
			System.out.println(key + ":" + map.get(key));
		}
		
	}
}
