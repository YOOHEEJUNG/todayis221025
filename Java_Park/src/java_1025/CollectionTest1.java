package java_1025;

import java.util.Arrays;

public class CollectionTest1 {
	
	public static void main(String[] args) {
		String [] ar = {"List", "Set", "Map"};
		//배열의 데이터를 수정하는 것은 가능
		ar[2] = "HashTable";
		System.out.println(Arrays.toString(ar));
		
		//ar 배열에 데이터를 추가
		//ar 배열보다 1개 더 큰 공간을 갖는 배열을 생성
		String [] arr = new String[ar.length + 1]; 
		//ar의 내용을 복사
		for(int i = 0; i < ar.length; i++) {
			arr[i] = ar[i];
		}
		//arr의 마지막에 데이터 추가
		arr[arr.length -1] = "Properties";
		//arr이 가리키는 곳을 ar이 가리키도록 함
		ar = arr;
		System.out.println(Arrays.toString(ar));
		
		
		//연습: set 삭제해보기!
		//ar의 크기보다 하나 작은 배열 생성
		String [] a = new String[ar.length-1];
		//ar의 배열 a 배열에 "set" 빼고 복사
		
		
		
	}
}
