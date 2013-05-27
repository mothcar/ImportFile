import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.annotation.Resources;


public class CompareNum {
	
	ArrayList<String> arr = new ArrayList<String>();
	String oldnum;
	
	public void readtext() {
		try {
			BufferedReader b = new BufferedReader(new FileReader("c:/lotto.txt"));
			
			while ((oldnum = b.readLine()) != null) {arr.add(oldnum + "\n");
			}
			
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	public static void main(String[] args) throws IOException{
		CreatNum cn = new CreatNum();

		String str = cn.createLottoNo();

		TotalNum tn = new TotalNum();
		int cnt = tn.seeknum();
	

		//oldnum = "1 2 3 4 5 ";
		//String str1 = "[1, 2, 3, 4, 5]";
		//String str2 = "1 2 3 4 5";
		System.out.println("aa" + oldnum);
		System.out.println("bb"+ str);

		for(int i=0; cnt>i ; i++){
			if(str == oldnum){
				System.out.println("Good");
			}
			else{
				System.out.println("Oh~NO~");
			}
		}
		b.close();

	}

}
