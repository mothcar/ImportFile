import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Lotto {
	
	public static void main(String[] args) throws IOException{
		//CompareSt st = new CompareSt();
		BufferedReader b = new BufferedReader(new FileReader("c:/lotto.txt"));
		String line;
		line = b.readLine();
		System.out.println("test bufferReader Lotto.txt" + line);
		
		CreatNum cn = new CreatNum();
		cn.createLottoNo();
		
		
	}

}
