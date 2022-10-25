package java_1025;

import java.util.Arrays;

public class ArrayMain {

	//문자열 배열에서 문자열의 위치 찾기
	public static void main(String[] args) {
		//문자열 배열 생성
		String [] actors = {"김지원","남궁민","송혜교","박은빈","한소희","강태오","서강준"};
		
		//이분 검색 수행 - sort를 하지 않아서 잘못된 결과 리턴
		int result = Arrays.binarySearch(actors, "한소희");
		System.out.println(result);
		
		//이분 검색은 데이터 정렬 후 검색해야 함!!!
		Arrays.sort(actors);
		result = Arrays.binarySearch(actors, "한소희");
		if(result >= 0) {
			System.out.printf("%s는 %d번째 존재\n","한소희",(result+1));
		}else {
			System.out.printf("%s는 존재하지 않음\n", "한소희");
		}
}
}
