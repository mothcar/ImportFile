import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class SeekIndex {

	//BufferedReader b = new BufferedReader(new FileReader("c:/lotto.txt"));

	public static void main(String[] args) {

		String s;
		int linecnt = 1;

		try {
			// FileReader, BufferedReader�� �����Ͽ�, LineNumberReader�� Chaining
			FileReader fr = new FileReader("C:\\lotto.txt");
			BufferedReader br = new BufferedReader(fr);
			LineNumberReader lr = new LineNumberReader(br);

			// ���̻� ���� Line�� ���� ������ �ݺ� 
			while ((s = lr.readLine()) != null){
				// LineNumberReader.getLineNumber() method�� �̿��Ͽ�, Line Number ����
				//System.out.println(lr.getLineNumber() + " >> " + s);
				linecnt++;
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(linecnt);
	}

}
