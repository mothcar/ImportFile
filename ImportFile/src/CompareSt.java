import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CompareSt {
	
	public String comp() throws IOException{	
		
		ScanKor sc= new ScanKor();
		String userStr =sc.sentense;

		//InputStreamReader str = new InputStreamReader(System.in);
		//BufferedReader str2 = new BufferedReader(str);

		//System.out.println("찾고싶은 문자열을 입력하세요");
		//String userStr = str2.readLine();

		//System.out.println("당신이 입력한 문자는 "+userStr+" 입니다.");

		BufferedReader b = new BufferedReader(new FileReader("c:/lotto.txt"));
		String line;
		line = b.readLine();
		System.out.println("test bufferReader Lotto.txt" + line);
		
		boolean tf = false;
		int i = 1;
		while ( (line = b.readLine()) != null ) 			  
		{
			if(line.equals(userStr)){
				System.out.println("당신이 찾는 문자 열은 "+i+"라인에 있습니다.");
				tf= true;
			}else {					  
			}				  
			i++;
		}

		if(!tf){
			System.out.println("당신이 찾는 문자열은 없습니다.");
		}
		return line;
		
	}

}
