package day05.ex;

/*
	문제 12 ]
		5자리 숫자 하나를 입력받아서 
		이 숫자가 회문수 인지 아닌지 판별하는 프로그램을 작성하세요.
		
		참고 ]
			회문수란?
				첫번째 자리수와 마지막 자리수
				두번째 자리수와 마지막에서 두번째 자리수
				...
				가 동일한 수를 말한다.
 */
import java.util.*;
public class ex1201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5자리 숫자를 입력하세요 :");
		String fiveNumStr = sc.nextLine();
		for(int i = 0 ; i < fiveNumStr.length() ; i++) {
			if(fiveNumStr.charAt(i)<'0'||fiveNumStr.charAt(i)>'9') {
				System.out.println("숫자를 써주십쇼. 프로그램 종료");
				break;
			}
		}
		int fiveNum = Integer.parseInt(fiveNumStr);
		switch(fiveNumStr.length()/2){
			case 0:
				for(int i = 0 ; i<fiveNumStr.length()/2-1 ;i++) {
					if(fiveNumStr.charAt(i)!=fiveNumStr.charAt(fiveNumStr.length()-1-i)) {
						System.out.print("회문수가 아닙니다. 프로그램 종료");
						break;
					}else {
						System.out.println("입력한 숫자"+fiveNum+"은 회문수가 맞습니다.");						
					}
				}
				break;
			case 1:
				for(int i = 0 ; i<fiveNumStr.length()/2 ;i++) {
					if(fiveNumStr.charAt(i)!=fiveNumStr.charAt(fiveNumStr.length()-1-i)) {
						System.out.print("회문수가 아닙니다. 프로그램 종료");
						break;
					}else {						
						System.out.println("입력한 숫자"+fiveNum+"은 회문수가 맞습니다.");
					}
				}
				break;
		}
	}
}

