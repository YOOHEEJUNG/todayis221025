package java_1025;

/*
//로직은 같은데 매개변수의 자료형이 달라서 Overloading을 이용해서 구현한 클래스
class Algorithm{
	//정수 2개를 더해서 결과를 리턴하는 메서드
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	//실수 2개를 더해서 결과를 리턴하는 메서드
	public static double add(double n1, double n2) {
		return n1 + n2;
	}
}
*/



//자료형의 이름을 임시로 만들어두고 내부에서 임시로 만든 자료형 사용한 후 
//인스턴스 생성할 때 자료형을 결정하는 방식을 이용
//단 인스턴스를 만들 때 또는 메서드를 호출할 때 실제 자료형을 기재해야 함
//이 때 사용되는 자료형은 Object로부터 상속받은 클래스의 자료형만 가능하다
//int와 primitive type의 경우는 Integer와 같은 Wrapper 클래스를 이용해야 함
//미지정 자료형의 개수는 제한 없음
//인스턴스를 만들 때 자료형을 설정하지 않으면 경고 발생
//class Algorithm<T>{
//	//2개의 데이터를 받아서 내용을 변경하는 메서드
//	public void swap(T n1, T n2) {
//		T imsi = n1;
//		n1 = n2;
//		n2 = imsi;
//	}
//}
//
//
//public class TemplateProgramming {
//	
//	public static void main(String[] args) {
//			//제너릭이 적용된 클래스의 인스턴스를 만들 때 자료형을 기재해야 함
//			//자료형을 기재하지 않으면 경고가 발생하고 Object 타입으로 간주함
//			Algorithm <Integer> algorithm = new Algorithm<>();
//			Integer n1 = 20;
//			Integer n2 = 30;
//			algorithm.swap(n1, n2);
//			System.out.println(n1);
//			System.out.println(n2);
//		
//	}
//}





//어떤 종류의 데이터든지 생성자에서 갯수에 상관없이 받아서 처리하는 제너릭스
class Generics <T>{
	private T [] data;
	
	//... 은 variable args로 갯수에 상관없이 매개변수를 받고자 할 때 사용
	//받은 매개변수들은 배열로 만들어집니다
	public Generics(T ... n) {
		this.data = n;
	}
	
	//배열의 데이터를 순차적으로 접근해서 출력하는 메서드
	public void display( ) {
		for(T temp : data) {
			System.out.println(temp);
		}
			
	}
}


public class TemplateProgramming{
	
	public static void main(String[] args) {
		//제너릭이 적용된 클래스의 인스턴스 만들기
		Generics <String> g1 = new Generics<String>("Suzy", "IU", "HanSoHee");
		g1.display();
		Generics <Integer> g2 = new Generics<>(100, 350, 300, 200);
		g2.display();
	}
}



