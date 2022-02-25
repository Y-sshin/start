package day04.ex;
/*
 	문제2
 		조건
 		문자를 랜덤하게 입력한 후 그문자가 대문자이면 소문자로
 		소문자이면 대문자로 변환하고 만약 특수문자이면 그대로 출력하는 프로그램을 작성하세요
 		3항연산자를 사용하여 작성할 것
 		참고 아스키코드는 
 		특문-숫자(0~9)-
 		특문-영문대문자(A~Z)-
 		특문-영문소문자(a~z)-
 		특문
 		문자열에서 문자를 추출하는 방법
 		문자열.charAt(dnlclrkqt)
 		예
 		"abcd"에서 두번째문자를 추출하려면
 		"abcd".charAt(1);
 */
import java.util.*;
public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//입력도구
		System.out.println("문자를 입력 :");//메세지
		String str = sc.nextLine();//입력받아서 문자열을 저장
		char ch = str.charAt(0);
		System.out.println("입력된문자 :" + ch);
		char result = (ch<'A')?(ch):((ch<='Z')?((char)(ch+('a'-'A'))):((ch<'a')?(ch):((ch<='z')?((char)(ch-('a'-'A'))):(ch))));
		System.out.println("결과는: " + result);
	}
}
