package day05.ex;

/*
	문제 7 ]
		5자리의 숫자를 입력한 후
		각자리의 수의 합을 구하는 프로그램을 작성하세요.
		몇 자리수의 정수가 입력되던 모든 자리를 계산하는 프로그램으로내용추
 */
import java.util.*;
public class ex0701 {//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 해 주세요 :");
		String num = sc.nextLine();
		int result=0;
		for(int i = 0 ; i < num.length() ; i++) {
			char ch = num.charAt(i);
			if(ch<'0'||ch>'9') {
				System.out.print("숫자가 아닌 부분이 있습니다.");
				break;
			}
			int no = (int) ch-('0');
			result += no;
		}
		System.out.println("총"+result);
		
		
	}//

}
