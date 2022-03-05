package day05.ex;

/*
	 문제 3 ]
	 	
	 	문자열을 입력받아서
	 	문자를 한글자씩 추출해서 출력하세요.
	 	
	 	참고 ]
	 		문자열의 길이를 알아내는 방법
	 			
	 			int 변수 = 문자열.length();
 */
import java.util.*;
public class ex0301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 :");
		String str = sc.nextLine();
		for(int i = 0 ; i < str.length() ; i++) {
			char al = str.charAt(i);
			System.out.print((i+1) + "번째 글자 " + al + "\t" );
			if((i+1)%5==0&&i!=0) {
				System.out.println();
			}
		}
	}

}
