package naver.gmlwjd.nestedclass;

public class Outer {
	
	//내포 클래스 -다른 클래스 안에 만들어진 클래스 
	class Inner{
	
		public int num;
		
	}
	
	
	//내포 클래스 안에 static 멤버가 있으면 인스턴스 생성 없이 사용할 수 있도록 
	static class StaticInner{
		public int num;
		public static int share;

	}

	public void method() {
		//메서드 안에 만들어진 클래스 - Local Inner
		//메서드 안에서만 사용이 가능한 클래스
		//외부에서 똑같은 기능이 필요하게 되면 내부에 있는 LocalInner class를 밖으로 꺼내서 일반 class로 사용
		class LocalInner {
			public int num;
		}
		
	}
	
	
}
