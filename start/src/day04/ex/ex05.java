package day04.ex;
/*
 	문제5
 		3자리 숫자를 입력받아서 이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
 		얼마가 필요한지를 계산하여 출력해 주는 프로그램을 작성하세요.
 */
public class ex05 {
	public static void main(String[] args) {
		System.out.println("3자리 숫자 임의생성");
		int no = (int)(Math.random() * (999-100+1)+100);
		System.out.println("생성된 임의의 숫자는 " + no + "입니다.");
		int result = (no%100 == 50)?(50):((no%100>50)?((((no/100)*100)+100)-no):(no-((no/100)*100)));
		//int un = (no/100)*100;
		//int ov = ((no/100)*100)+100;
		System.out.println(result + "만큼 필요합니다.");
	}
}
