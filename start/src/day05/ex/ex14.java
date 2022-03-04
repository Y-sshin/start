package day05.ex;

/*
	문제 14 ]
		다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하세요.
		
		1. 4자리 숫자 abcd는 0이 들어있지 않고, 모두 다른 숫자이다.
		2. 첫번째 숫자(a)가 마지막 숫자(d)보다 2 큼
		 3<=a<=9
		 1<=d<=7
		 b>=c+1
		3. 두번째 숫자(b)가 세번째 숫자(c)보다 크다.
		4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456이 된다.
		
		아하! 숫자를 먼저 만들고 비교하는게 아니구나 
 */
public class ex14 {

	public static void main(String[] args) {
		int a,b,c,d;
		int result = 0;
		loop:
		for( a = 3 ; a <= 9 ; a++) {
			 d = a - 2;
			 for(b = 2 ; b <= 9 ; b++) {
				 if(b==a||b==d) {
					 continue;
					 //이 경우는 같은 숫자가 발생하는 경우, 조건에 맞지 않으니 다음 번호를 호출
				 }
				 //이 라인을 실행하는 경우는 b가 a와 d와 같지 않은 경우
				 for(c = 1 ; c < b ; c++) {
					 //if(c<=b) {
					//	 break;//이 회차를 포함하여 이후에 진행되는 회차는 모두c>b인 경우라서 진행할 필요가 없다
					 //}
					 if(c==a||c==d) {
						 continue;
					 }
					 //여기서 첫번째for문의 다음사이클을 돌기 전, 마지막 조건에 맞는지 검사
					 int no1 = (a*1000) + (b*100) + (c*10) + d;
					 int no2 = (d*1000) + (c*100) + (b*10) + a;
					 if(no1+no2==16456) {
						 //이때 모든 조건에 맞는 숫자
						 result = no1;
						 break loop;
					 }
				 }
			 }
			
		}
		System.out.print(result);
	}

}
