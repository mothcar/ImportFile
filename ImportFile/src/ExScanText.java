import java.io.IOException;



public class ExScanText {
	public static void main(String[] args) throws IOException{
		ScanKor sk = new ScanKor();
		sk.sendtext();
		
		CompareSt cst = new CompareSt();
		cst.comp();
	}

	
}

/** ���ڿ� ��
 public static void main(String[] args) {

    String s = "abcdoooooefghi";

    try {
      if (s.matches(".*ooo.*"))
        System.out.format("��ġ�Ǿ����ϴ�.%n");
      else
        System.out.format("�׷� ���ڿ��� �����ϴ�.%n");

    } catch (PatternSyntaxException e) { // ���ԽĿ� ������ �ִٸ�
        System.err.println(e);
        System.exit(1);
    }


  }
**/