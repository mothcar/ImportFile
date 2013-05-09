import java.io.IOException;



public class ExScanText {
	public static void main(String[] args) throws IOException{
		ScanKor sk = new ScanKor();
		sk.sendtext();
		
		CompareSt cst = new CompareSt();
		cst.comp();
	}

	
}

/** 문자열 비교
 public static void main(String[] args) {

    String s = "abcdoooooefghi";

    try {
      if (s.matches(".*ooo.*"))
        System.out.format("매치되었습니다.%n");
      else
        System.out.format("그런 문자열이 없습니다.%n");

    } catch (PatternSyntaxException e) { // 정규식에 에러가 있다면
        System.err.println(e);
        System.exit(1);
    }


  }
**/