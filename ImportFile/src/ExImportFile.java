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
	   * �ؽ�Ʈ ������ ���� �б� ��
	   */
	  
	  BufferedReader b = new BufferedReader(new FileReader("c:/1.txt"));
	  String line;
	  int i = 1;
	  while ( (line = b.readLine()) != null ) //������ ���� null �� �ɶ����� �о
	  {
	   println(i + " line : " + line);
	   
	   /* -------------------------------------------------
	    * ��ū�������� �̿��� �ܾ �и���Ŵ
	    */
	   StringTokenizer tk = new StringTokenizer(line, " "); // ���� �и��ܾ�� " " ���� �����̽��� ��������
	   String token;
	   println("�и��� �ܾ� �� : " + tk.countTokens());
	   while ( tk.hasMoreTokens() ) {
	    token = tk.nextToken();
	    print("\""+ token + "\"" + "\t"); //  \" �� �ϳ��� ����
	   }
	   //println("); //what is this?"
	  
	   i++;
	  }
	  b.close(); 
	 }

	}