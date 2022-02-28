package day04.ex;
/*
	문제1.
		조건 1~25
		숫자 세개를 랜덤하게 발생시켜서 그 수 중 가장 큰 수만 출력하는 프로그램을 작성하세요
		단, 3항연산자를 사용해서 처리하세요
*/
public class ex0101 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random()*(25-1+1)+1);//랜덤정수발생
		int no2 = (int)(Math.random()*(25-1+1)+1);
		int no3 = (int)(Math.random()*(25-1+1)+1);
		
		int max = (no1>no2)?(
				
				(no1>no3)?(no1):(no3)
				
				
				):(
						(no2>no3)?(no2):(no3)
						
						);//판별후 변수에 할당
				System.out.println("\"입력한 세 정수 \n" + no1 + ", " + no2 + ", " + no3 + "\n중 제일 큰 수는 " + max + "입니다.");
	}
}