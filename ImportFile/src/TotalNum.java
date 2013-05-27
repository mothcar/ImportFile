import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class TotalNum {
	
	public int seeknum(){
		String s;
		int linecnt = 1;

		try {
			// FileReader, BufferedReader를 생성하여, LineNumberReader와 Chaining
			FileReader fr = new FileReader("C:\\lotto.txt");
			BufferedReader br = new BufferedReader(fr);
			LineNumberReader lr = new LineNumberReader(br);

			// 더이상 읽을 Line이 없을 때까지 반복 
			while ((s = lr.readLine()) != null){
				
				linecnt++;
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return linecnt;
		
	}

}
