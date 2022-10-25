package java_1025;

public class NoRecursionFibonacci {

	//n번째 피보나치 수열의 값을 리턴해주는 메서드
	public static Long fibonacci(int n) {
		//이전 항의 값과 이전의 이전 항의 값을 저장할 변수
		Long f1 =(long) 1;
		Long f2 =(long) 1;
		
		//피보나치 값을 저장할 변수
		Long fibo = (long) 1;
		
		for(Long i = (long)3; i <= n; i++) {
			fibo = f1 + f2;
			f2 = f1;
			f1 = fibo;
		}
		return fibo;
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(100));
		
	}
	
}
