package naver.gmlwjd.queue;


	interface Starcraft {

		public void attack();
	}
	
	class Protoss implements Starcraft{
		public void attack() {
			System.out.println("질럿의 공격");
		}
	}
	
	
	//동일한 메서드에 다른 반응 = poly
	public class AnonymousMain {
		
		public static void main(String[] args) {
			//인터페이스를 implements한 클래스를 만들고 인스턴스를 만든 후 메서드를 호출
			Starcraft star = new Protoss();
			star.attack();
			
			//인터페이스를 implements한 클래스를 만들지 않고 인스턴스를 생성해서 호출
			star = new Starcraft() {
				
				public void attack() {
					System.out.println("저그의 공격");
				}
			};
			star.attack();
		
		
		//변수 쓰지 않고 인스턴스만 생성해서 메서드 호출
		new Starcraft() {

			@Override
			public void attack() {
				System.out.println("테란의 공격");
			}
			
		}.attack();


	}

}



