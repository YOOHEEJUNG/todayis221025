package naver.gmlwjd.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		try (//인스턴스 단위로 파일에 기록할 수 있는 객체 생성
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("serializable.txt"))){
			;
			
			//기록할 인스턴스 생성
			StudentDTO dto1 = new StudentDTO(1, "민니", new Date()); 
			StudentDTO dto2 = new StudentDTO(2, "우기", new Date()); 
			
			
			ArrayList<StudentDTO> list = new ArrayList();
			list.add(dto1);
			list.add(dto2);
			
			
			//기록
			oos.writeObject(list);
			
			//oos.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
		try (//인스턴스 단위로 파일에 읽어낼 수 있는 객체를 생성
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("serializable.txt"));
			){
			
			//기록을 할 때 List를 사용했으므로 읽어올 때 List로 읽어와야 함
			ArrayList list = (ArrayList) ois.readObject();
			
			for(Object obj : list) {
			System.out.println(obj);}
			
			//ois.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
