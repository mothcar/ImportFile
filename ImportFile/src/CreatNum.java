import java.util.Arrays;


public class CreatNum {
	int[] lotto = new int [6]; //0
	int cnt=0; //담겨져있는 배열의 크기를 체크하기위해 전역변수
	//int k = ;

	//1. 난수를 1~45사이의 난수를 발생시켜서 배열에 저장메소드
	public int[] createLottoNo(){

		//int cnt=0;
		while(cnt < 6){
			int lottoNo = (int)(Math.random()*45)+1;
			if(isCompareLottoNo(lottoNo)){ //true라면 중복아니다.
				lotto[cnt] = lottoNo;
				//System.out.println(lotto[cnt]);
				cnt++;
			}
		}


		int i, j, k;

		for(i=0; i<6; i++){        // 정렬 조건
			for(j=0; j<=i; j++){
				if( lotto[i]<=lotto[j]){
					k=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=k;
				}
			}
		}
		String str = Arrays.toString(lotto);
		return lotto;
		//String st = lotto.toString();
		//System.out.println(st);
		//System.out.println(Arrays.toString(lotto));
	}

	//2. 저장된 배열에 잇는 숫자와 현재 발생되 난수의 숫자가 같은지 비교하는 메소드 작성
	public boolean isCompareLottoNo(int lottoNo){//lottoNo는 현재발생된숫자
		//for(int i=0;i<lotto.length;i++){
		for(int i=0;i<=cnt;i++){
			if(lotto[i] == lottoNo) return false; //중복이다.
		}
		return true; //중복아니다.
	}

}

//test commit 001
