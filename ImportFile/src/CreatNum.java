import java.util.Arrays;


public class CreatNum {
	int[] lotto = new int [6]; //0
	int cnt=0; //������ִ� �迭�� ũ�⸦ üũ�ϱ����� ��������

	//1. ������ 1~45������ ������ �߻����Ѽ� �迭�� ����޼ҵ�
	public void createLottoNo(){

		//int cnt=0;
		while(cnt < 6){
			int lottoNo = (int)(Math.random()*45)+1;
			if(isCompareLottoNo(lottoNo)){ //true��� �ߺ��ƴϴ�.
				lotto[cnt] = lottoNo;
				System.out.println(lotto[cnt]);
				cnt++;
			}
		}
		String st = lotto.toString();
		System.out.println(st);
		System.out.println(Arrays.toString(lotto));
	}

	//2. ����� �迭�� �մ� ���ڿ� ���� �߻��� ������ ���ڰ� ������ ���ϴ� �޼ҵ� �ۼ�
	public boolean isCompareLottoNo(int lottoNo){//lottoNo�� ����߻��ȼ���
		//for(int i=0;i<lotto.length;i++){
		for(int i=0;i<=cnt;i++){
			if(lotto[i] == lottoNo) return false; //�ߺ��̴�.
		}
		return true; //�ߺ��ƴϴ�.
	}

}
