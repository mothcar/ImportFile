import java.util.Scanner;
import java.util.StringTokenizer;

class StringTest04{

	public static void main(String[] agrs){



		Scanner scanner = new Scanner(System.in); 

		System.out.print("�ܾ� ���̸��� /�� �־ �Է�(50�� �̳�):"); 



		String[] str = new String[50]; // �ܾ �ִ� 50�� ����

		int[] strCnt = new int[50]; // �ߺ��ܾ �ִ� 50�� ������ ����

		String line = scanner.nextLine();



		for(int i=0; i<line.length(); i++) { //charAt() �޼ҵ带 ����� �� ���� �ڸ��� char ���ڸ� ������

			line.charAt(i);

		}


		StringTokenizer tokens = new StringTokenizer(line,"/"); // ���ڿ� �� ����




		while (tokens.hasMoreTokens()) {

			String word = tokens.nextToken();



			for (int idx = 0; idx < 50; idx++) {

				if (str[idx] == null) { // �迭�� ����� ������ ���� �� �� �߰�

					str[idx] = word;

					strCnt[idx] = 1;

					break;

				}

				else if (word.equals(str[idx])) { // �迭�� �ش� �ܾ ������ ī��Ʈ ����

					strCnt[idx]++;

					break;

				}

			}

		}

		for (int idx = 0; idx < 50; idx++) {

			if (str[idx] != null) {

				System.out.println(str[idx] + " " + strCnt[idx] + "��"); 

			} else {

				break;

			}

		} // ��� ����� ���� for��

	}

}
