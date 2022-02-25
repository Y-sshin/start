package day04.ex;
/*
 	문제4
 		1000~3000사이의 숫자를 랜덤하게 발생시켜서 이 숫자를 년도로 하는 해는 
 		윤년인지 평년인지를 판별해서 출력해주는 프로그램을 작성하세요.
 		참고 
 		4로 나누어 떨어지면 윤년
 		100으로 나누어 떨어지면 평년
 		400으로 나누어 떨어지면 윤년
 */
public class ex04 {
	public static void main(String[] args) {
		int years = (int)(Math.random() * (3000-1000+1)+1);
		String yun = (years%400==0)?("윤년입니다."):((years%100==0)?("평년입니다."):((years%4==0)?("윤년입니다."):("평년입니다.")));
		System.out.println("생성된 년도는 " + years + "이 해는 " + yun);
	}

}
