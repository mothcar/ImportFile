import java.util.Scanner;


public class ScanKor {
	Scanner s = new Scanner(System.in);
	String sentense = s.nextLine();
	
	
	public String sendtext(){
		System.out.println(sentense);
		return sentense;
		
	}
	

}
/*
 * 
 * 
 * ****낮은 경우의 수*******
 *이름이 문장 첫단락에 올경우를 대비해서 성씨에 대한 txt만들기
 *+이름이 있을경우 이름.txt를 만들어서 이름으로 인식 
 */

