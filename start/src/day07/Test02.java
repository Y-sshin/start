package day07;
/*
 	6개의 메모리를 배열로 만들로 그 안에 랜덤한 숫자를 입력한 뒤 출력
 */

public class Test02 {
	public static void main(String[] args) {
		//배열의 주소를 기억할 변수를 생성
		int[] lotto;
		//배열을 만들기
		lotto = new int[6];
		int len = lotto.length;
		loop:
		for(int i = 0 ; i < len ; i++) {
			//랜덤하게 숫자를 만들어서
			int no = (int)(Math.random()*45+1);
			
			//$중복검사부분$ : 지금만든 번호가 이전에 만들어진 번호라면 지금회차를 다시 반복하자
			for(int k = 0 ; k < i ; k++) {
				//이전에 만든 번호를 추출
				int tmp = lotto[k];
				if(no==tmp) {
					//이경우는 지금만든 번호가 이전회에서 이미 만든 번호이므로 지금회차를 다시 반복한다.
					i--;
					continue loop;  //루프없이 -1만 추가하면 왜 중복이 나오는건가 ???
				}
			}
			
			//배열에 채워 넣는다.
			lotto[i]=no;
		}
		//하나씩 꺼내서 출력을 한다.
		for(int j = 0 ; j < lotto.length ; j++) {			
			System.out.println(lotto[j]+" | ");
		}
		System.out.println();
	}

}

