import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class TotalNum {
	
	public int seeknum(){
		String s;
		int linecnt = 1;

		try {
			// FileReader, BufferedReader�� �����Ͽ�, LineNumberReader�� Chaining
			FileReader fr = new FileReader("C:\\lotto.txt");
			BufferedReader br = new BufferedReader(fr);
			LineNumberReader lr = new LineNumberReader(br);

			// ���̻� ���� Line�� ���� ������ �ݺ� 
			while ((s = lr.readLine()) != null){
				
				linecnt++;
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return linecnt;
		
	}

}
