import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class ExImportFile {

	 static void println(String s) {
	  System.out.println(s);
	 }
	 static void print(String s) {
	  System.out.print(s);
	 }
	 
	 public static void main(String[] args) throws IOException {
	  
	  /*
	   * 텍스트 파일의 라인 읽기 예
	   */
	  
	  BufferedReader b = new BufferedReader(new FileReader("c:/1.txt"));
	  String line;
	  int i = 1;
	  while ( (line = b.readLine()) != null ) //라인의 값이 null 이 될때까지 읽어냄
	  {
	   println(i + " line : " + line);
	   
	   /* -------------------------------------------------
	    * 토큰라이저를 이용해 단어를 분리시킴
	    */
	   StringTokenizer tk = new StringTokenizer(line, " "); // 현재 분리단어는 " " 공백 스페이스로 나누어짐
	   String token;
	   println("분리된 단어 수 : " + tk.countTokens());
	   while ( tk.hasMoreTokens() ) {
	    token = tk.nextToken();
	    print("\""+ token + "\"" + "\t"); //  \" 를 하나로 볼것
	   }
	   //println("); //what is this?"
	  
	   i++;
	  }
	  b.close(); 
	 }

	}