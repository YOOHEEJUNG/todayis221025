package naver.gmlwjd.thread;

public class DaemonThread {

	public static void main(String[] args) {
		//1부터 10까지를 1초씩 딜레이하면서 출력해주는 스레드
		Thread th = new Thread(() -> {
			for(int i =0; i<10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
		th.setDaemon(true);
		th.start();
		
		try {
			Thread.sleep(3000);
			System.out.println("메인 종료");
		} catch (Exception e2) {
			System.out.println(e2.getLocalizedMessage());
		}
	}

}
