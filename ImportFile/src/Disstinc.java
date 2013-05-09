import java.util.Scanner;


public class Disstinc {
	
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String sentence=null;
		
		StringBuffer sb = new StringBuffer();
		
		
		char check;
		/*
		if(str.equals(""))
		{
			System.out.println("space");
			//문자열이 공백인지 확인
		}
		*/
		for(int i = 0; i<str.length(); i++){
			check = str.charAt(i);
			if( check >= 49 && check <= 59)
			{
				sb.append(check);
			}
		}
		System.out.println(sb);
	}

}




