package day05.ex;

/*
	문제 8 ]
		숫자형식의 다섯자리 정수형태 문자열을 입력받아서
		각자리 수의 합을 구하는 프로그램을 작성하세요.
		
		문자열로 입력받아서 문자로 변환후 처리하세요.
 */
import java.util.*;
public class ex0801 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5자리 숫자입력 :");
		String five = sc.nextLine();
		int result = 0;
		for(int i =0;i<five.length();i++) {
			int num = (int)(five.charAt(i));
			result += num;
		}
		System.out.println("합 :"+result);
	}

}
