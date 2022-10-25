package java_1024;

import java.util.Arrays;

public class ArrayTask {
	public void main(String [] args) {

		//문자열 배열 생성
		String [] arr = {"카리나", "아이린", "윈터", "조이"};

		//배열을 순회
		for(String d:arr) {
			System.out.println(d);
		}


		//선택 정렬
		//1. 배열의 복제
		String [] copyAr = Arrays.copyOf(arr, arr.length);

		//선택정렬
		//첫번째부터 n-1 번째 데이터까지
		for(int i = 0; i < copyAr.length-1; i++) {
			//자신의 뒤에 있는 모든 데이터와 비교해서
			for(int j = i+1; j < copyAr.length; j++) {
				//뒤에 있는 데이터가 더 크다면(작다면) 교환
				if(copyAr[i].compareTo(copyAr[j])<0) {
					String temp = copyAr[i];
					copyAr[i] = copyAr[j];
					copyAr[j] = temp;
				}

			}
		}
	}

	//문자열의 크기 비교 하는 메서드: compareTo, compareToIngonorecase
	//System.out.println(ar[1].compareTo(ar[0]));

}

