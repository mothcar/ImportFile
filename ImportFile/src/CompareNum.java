import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.annotation.Resources;


public class CompareNum {
	
	static ArrayList<String> arr = new ArrayList<String>();
	static String oldnum;
	
	public static String readtext() {
		try {
			BufferedReader b = new BufferedReader(new FileReader("c:/lotto.txt"));
			
			while ((oldnum = b.readLine()) != null) {arr.add(oldnum + "\n");
			}
			System.out.println("aa" + oldnum);
			
		} catch (Exception e) {
			System.out.println("Error");
		}
		//b.close();
		return oldnum;
	}

	public static void main(String[] args) throws IOException{
		CreatNum cn = new CreatNum();
		String str = cn.createLottoNo();
		
		//old lotto Number
		String lottoNum = readtext(); 

		TotalNum tn = new TotalNum();
		int cnt = tn.seeknum();
	

		//oldnum = "1 2 3 4 5 ";
		//String str1 = "[1, 2, 3, 4, 5]";
		//String str2 = "1 2 3 4 5";
		System.out.println("aa" + lottoNum);
		System.out.println("bb"+ str);

		for(int i=0; cnt>i ; i++){
			if(str == oldnum){
				System.out.println("Good");
			}
			else{
				System.out.println("Oh~NO~");
			}
		}
		

	}
	

}
