package day05.ex;

/*
	문제 9 ]
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
 */

public class ex0901 {
	public static void main(String[] args) {
		int result = 0;
		for(int i=0;i<100;i++) {
			result += i;
			if(result>100)break;
		}
		System.out.println(result);
	}

}//문제를 잘못 이해했음 중간에 빼기가 있음 다시할것
