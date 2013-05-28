import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Lotto {
	
	public static void main(String[] args) throws IOException{
		//CompareSt st = new CompareSt();
		BufferedReader b = new BufferedReader(new FileReader("c:/lotto.txt"));
		String line;
		line = b.readLine();
		System.out.println("test bufferReader Lotto.txt" + line);
		
		String arr[];
		
		arr = line.split("\t");
		dumpArray(arr);
		
		CreatNum cn = new CreatNum();
		String str = cn.createLottoNo();
		System.out.println(str);
		
		
	}

	private static void dumpArray(String[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++)
		      System.out.format("array[%d] = %s%n", i, arr[i]);
		
	}

}
