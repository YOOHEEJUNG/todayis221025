package naver.gmlwjd.bufferdstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteBufferStream {

	public static void main(String[] args) {
		
		try {
				PrintStream ps = new PrintStream(new FileOutputStream("./buffer.txt"));
				ps.print("곧 점심시간이다!!!!! 밥 먹자~~~~~~");
				ps.flush();
				ps.close();
				
				
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
	}
}
