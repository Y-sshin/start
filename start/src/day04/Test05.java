package day04;
/*
 	1~25사이의 정수를 랜덤하게 발생시켜서 그 숫자가 짝수인지 홀수인지를 판별하고 출력하세요.
 		특정범위의 랜덤한 숫자를 발생시키는 방법
 		Math 클래스 내에 0이상~1미만의 실수를 발생시켜 주는 함수가 있는데 그 함수가.
 		Math.random.()
 	형식:a~b사이의 랜덤한 정수(작은수<큰수가정)
 		(int)(Math.random() * (큰수-작은수+1)+작은수)
 */
public class Test05 {
	public static void main(String[] args){
		int no = (int)(Math.random() * (25-1+1)+1);//랜덤하게 숫자 만들기
		String result = (no%2==0)?("짝수"):("홀수");//숫자 판별하고
		System.out.println("1부터25사이에서 랜덤하게 발생한 숫자" + no + "는 " + result + "입니다.");
	}
	
}
