package day05.ex;
//1부터 10까지의 합을 구해서 출력하는 프로그램 작성
public class ex0101 {
	public static void main(String[] args) {
		int sum = 0;//결과값으로 사용할 변수 생성
		for(int i = 0 ; i <= 10 ; i++) {   //반복문 작성 i는 0부터 시작 9까지 
		sum += i;
		}
		System.out.println(sum);//누적된 값 출력
		
		int gop = 1;
		for(int i = 0 ; i < 10 ; i++) {
			gop = gop * (i+1);
		}
		System.out.println(gop);//곱셈된 값 출력
	}
}