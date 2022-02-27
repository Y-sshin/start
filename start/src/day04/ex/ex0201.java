package day04.ex;
/*
 * 
	알파벳을 입력받아서 그 문자가 대문자인지 소문자인지 판별하는 프로그램을 작성하세요.
 */
import java.util.*;
public class ex0201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 입력 :");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		System.out.println("입력된 문자는 :" + str);
		String result = (ch<='Z')?((ch<'A')?("알파벳이 아닙니다"):("대문자입니다")):((ch<'a'||ch>'z')?("알파벳이 아닙니다"):("소문자입니다."));
		System.out.println(ch + "는 " + result);
	}
}
