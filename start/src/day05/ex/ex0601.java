package day05.ex;

/*
	문제 6 ]
		랜덤하게 정수를 컴퓨터가 만들어 내면
		그 수를 알아맞추는 게임을 만드세요.
		
		예 ]
			
			발생숫자 : 54
			
			사용자입력숫자 : 45
			
			==> "입력한 수가 더 작습니다."
			로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...
			
			횟수도 같이 출력되게 하세요.
 */
import java.util.*;
public class ex0601 {
	public static void main(String[] args) {
		int pcRandom = (int)((Math.random() * 100)+1);
		Scanner sc = new Scanner(System.in);
		System.out.println("pc는 1~100사이의 수를 만들었습니다.");
		int i=0;
		while(true) {
			System.out.print((i+1)+"번째 시도입니다.");
			int userExpect = sc.nextInt();
			if(i<10&&pcRandom==userExpect) {
				System.out.println("맞았음");				
				sc.close();
				i+=1;
				break;
			}else if(i<10&&pcRandom>userExpect) {
				System.out.println("pc의 숫자가 더 큽니다.");
				i=i+1;
			}else if(i<10&&pcRandom<userExpect) {
				System.out.println("user의 숫자가 더 큽니다.");				
				i=i+1;				
			}else {
				if(i>=10)
				break;
			}
		}
	}

}//전체 횟수를 5번으로 제한하는 코드를 다시 해 볼 것