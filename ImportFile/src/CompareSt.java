import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CompareSt {
	
	public String comp() throws IOException{	
		
		ScanKor sc= new ScanKor();
		String userStr =sc.sentense;

		//InputStreamReader str = new InputStreamReader(System.in);
		//BufferedReader str2 = new BufferedReader(str);

		//System.out.println("ã����� ���ڿ��� �Է��ϼ���");
		//String userStr = str2.readLine();

		//System.out.println("����� �Է��� ���ڴ� "+userStr+" �Դϴ�.");

		BufferedReader b = new BufferedReader(new FileReader("c:/lotto.txt"));
		String line;
		line = b.readLine();
		System.out.println("test bufferReader Lotto.txt" + line);
		
		boolean tf = false;
		int i = 1;
		while ( (line = b.readLine()) != null ) 			  
		{
			if(line.equals(userStr)){
				System.out.println("����� ã�� ���� ���� "+i+"���ο� �ֽ��ϴ�.");
				tf= true;
			}else {					  
			}				  
			i++;
		}

		if(!tf){
			System.out.println("����� ã�� ���ڿ��� �����ϴ�.");
		}
		return line;
		
	}

}
