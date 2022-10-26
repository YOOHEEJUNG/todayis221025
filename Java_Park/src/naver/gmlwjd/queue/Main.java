package naver.gmlwjd.queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import naver.gmlwjd.stack.PersonVO;

public class Main {

	public static void main(String[] args) {
	//PriorityQueue는 데이터를 정렬되 순서대로 꺼낼 수 있도록 해주는 클래스
		
		
		//정수를 저장하는 PriorityQueue를 만들어서 출력
		PriorityQueue<Integer> intQueue = 
				new PriorityQueue<>();
		
		//데이터 저장(트리 구조로 저장)
		intQueue.offer(100);
		intQueue.offer(70);
		intQueue.offer(90);
		
		//데이터 꺼내기
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		
		//PersonVO 클래스를 저장하는 우선순위 큐
		//이 상태에서 만들면 PersonVO의 크기 비교를 할 수 없기 때문에 예외 발생
		//PriorityQueue<PersonVO> persons = new PriorityQueue<>();
		
		//PersonVO 클래스에 Comparable 인터페이스를 implements하고
		//compareTo라는 메서드를 재정의해서 해결할 수 있고
		
		//Comparator 인터페이스를 대입받을 수 있는 경우에는 Comparator 인터페이스를 
		//구현한 클래스의 인스턴스를 이용해서 생성해도 됨
		
		PriorityQueue<PersonVO> persons = 
				new PriorityQueue<>(new Comparator<PersonVO>() {

					@Override
					public int compare(PersonVO o1, PersonVO o2) {
						return o2.getBirth().compareTo(o1.getBirth());
						
						
					}
					
				});
		persons.offer(new PersonVO(1, "아담", new Date(100, 12, 9), "ESTJ"));
		persons.offer(new PersonVO(2, "이브", new Date(90, 1, 8), "ISTP"));
		persons.offer(new PersonVO(3, "레미", new Date(95, 12, 8), "INTP"));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		
		
	}
}
