package day05.ex;

/*
	문제 14 ]
		다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하세요.
		
		1. 4자리 숫자 abcd는 0이 들어있지 않고, 모두 다른 숫자이다.
		2. 첫번째 숫자(a)가 마지막 숫자(d)보다 2 큼
		3. 두번째 숫자(b)가 세번째 숫자(c)보다 크다.
		4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456이 된다.
 */

public class ex1401 {
	public static void main(String[] args) {
		int result = 0;
		for(int d = 1 ; d <= 7 ; d++) {
			for(int c = 1 ; c<=9 ; c++) {
				if(d==c)continue;
				for(int b = c+1 ; b <= 9 ; b++) {
					int a = d+2;
					if((a*1000)+(b*100)+(c*10)+(d)+(d*1000)+(c*100)+(b*10)+(a)==16456) {
						result=(a*1000)+(b*100)+(c*10)+(d);
						break;
					}
				}
			}
		}
		System.out.print("답은:"+result);
	}

}
//이유를 모르겟음