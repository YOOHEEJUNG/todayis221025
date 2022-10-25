package java_1024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		//배열 생성
		PersonVO [] persons = {
				new PersonVO(1, "수지", 29),
				new PersonVO(2, "아이유", 30),
				new PersonVO(3, "카리나", 23)
		};

		//Arrays.sort 메서드는 배열을 대입하면 부등호 또는 compareTo 라는 메서드를 호출해서 
		//크기 비교를 한 후 정렬을 수행함
		Arrays.sort(persons);




		System.out.println("1. 이름의 오름차순 "+ "2. 이름의 내림차순 "
				+ "3. 나이의 오름차순 " + "4. 나이의 내림차순");

		Scanner sc = new Scanner(System.in);
		String menu = sc.nextLine();

		//공백을 써도 제거해주기 때문에 ㄱㅊ
		switch (menu.trim()) {

		case "1":
			//동적으로 크기 비교하는 메서드 설정

			break;
		case "2":
			
			break;
		case "3":
			System.out.println("나이의 오름차순");
			break;
		case "4":
			System.out.println("나이의 내림차순");
			break;

		default:
			System.out.println("1~4번 안에서만 선택하십쇼");
			break;

		}


		//배열의 데이터 출력
		//Arrays.toString은 배열의 각 요소의 toString을 전부 호출해서
		//하나의 문자열로 리턴하는 메서드
		System.out.println(Arrays.toString(persons));
		//System.out.println(System.identityHashCode(persons)); //해시코드:사용하고 있는 공간	

		//예외 발생 - PersonVO에는 크기 비교를 할 수 있는 메서드 존재x











	}
}
