import java.util.Scanner;
import java.util.StringTokenizer;

class StringTest04{

	public static void main(String[] agrs){



		Scanner scanner = new Scanner(System.in); 

		System.out.print("단어 사이마다 /를 넣어서 입력(50자 이내):"); 



		String[] str = new String[50]; // 단어를 최대 50개 설정

		int[] strCnt = new int[50]; // 중복단어를 최대 50개 나오게 설정

		String line = scanner.nextLine();



		for(int i=0; i<line.length(); i++) { //charAt() 메소드를 사용해 각 문자 자리의 char 문자를 가져옴

			line.charAt(i);

		}


		StringTokenizer tokens = new StringTokenizer(line,"/"); // 문자열 나 누기




		while (tokens.hasMoreTokens()) {

			String word = tokens.nextToken();



			for (int idx = 0; idx < 50; idx++) {

				if (str[idx] == null) { // 배열에 빈공간 나오면 다음 단 어 추가

					str[idx] = word;

					strCnt[idx] = 1;

					break;

				}

				else if (word.equals(str[idx])) { // 배열에 해당 단어가 있을때 카운트 증가

					strCnt[idx]++;

					break;

				}

			}

		}

		for (int idx = 0; idx < 50; idx++) {

			if (str[idx] != null) {

				System.out.println(str[idx] + " " + strCnt[idx] + "번"); 

			} else {

				break;

			}

		} // 결과 출력을 위한 for문

	}

}
