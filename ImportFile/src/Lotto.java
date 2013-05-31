import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Lotto {

	//@SuppressWarnings("null")
	public static void main(String[] args) throws IOException{

		boolean flag = false; 


		while(flag == false){

			//1. Create Number
			//CreatNum cn = new CreatNum();
			//int[] str = cn.createLottoNo();
			int[] str = {10,23,29,33,37,40};
			String str1 = Arrays.toString(str);
			System.out.println("create Number" +str1);

			//String crarr[];
			//crarr = str.split(", ");

			//2. Call Old number
			BufferedReader b = new BufferedReader(new FileReader("c:/lotto.txt"));
			String line;
			line = b.readLine();
			//System.out.println("Lotto.txt" + line);

			//2.2 to Array
			//
			String[] lotarr;
			String[] lotary = new String[6];
			int[] intary = new int[6];
			lotarr = line.split("\t");
			for(int i=0; i<6; i++){
				lotary[i] = lotarr[i+1];
				intary[i] = Integer.parseInt(lotary[i]);

			}
			String toarr = Arrays.toString(intary);
			System.out.println("To integer"+toarr);
			String toarr1 = Arrays.toString(lotary);
			System.out.println("splited lotte"+toarr1);


			//3. Compare two array
			int j=0;
			for(int i=0; i<6; i++){

				if (str[i] == intary[i]){
					j+=j;
				}
			}
			if(j==6){
				System.out.println(str1);
				flag = true;
			}




		}


	}
}


