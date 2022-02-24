package day03.ex;

/*
	문제 1 ] 
		두개의 숫자를 입력 받은 후(가로, 세로)
		그 숫자를 이용하여 사각형의 넓이와 삼각형의 넓이를 구해서
		결과를 출력하세요
		출력 형식 ]
			가로 : XXXX
			세로 : XXXX
			사각형 넓이 : XXXX
			삼각형 넓이 : XX.X
 */
import java.util.*;
public class ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// 입력도구 준비
		/*
		System.out.print("가로 : ");// 입력메세지출력

		String garo = sc.nextLine();// 문자열로 입력받는 방법

		int width = Integer.parseInt(garo);//정수형태의 문자열을 정수로 변환하는 법
		System.out.println("입력된 가로 : " + (garo + 20));//출력
		
		*/
		System.out.println("정수형태로 입력받아서 계산한다.");
		System.out.print("가로의 길이를 입력하세요(cm) : ");
		int garo = sc.nextInt();
		System.out.print("세로의 길이를 입력하세요(cm) : ");
		int sero = sc.nextInt();
		System.out.println("가로가 " + garo + "이고, 세로가 " + sero + "인 사각형, 삼각형의 넓이 계산" );
		int sagak = garo*sero;
		double samgak = garo*sero*(double)0.5;
		System.out.println("사각형의 넓이는 " + sagak + "(cm2)이고, 삼각형의 넓이는 " + samgak + "(cm2)이다.");
	}
}
