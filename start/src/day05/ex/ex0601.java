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
		System.out.println("pc는 1~100사이의 수를 만들었습니다. 무엇일까요 :");
		Scanner sc = new Scanner(System.in);
		int userExpect = sc.nextInt();
		for(int i = 0 ; i > 10; i++) {
			System.out.println("[" + (10 - i) + "] 번의 기회가 있습니다.\n 숫자를 입력하세요 :");
			if(pcRandom==userExpect) {
				System.out.println("정답입니다. " + i + "번 만에 정답을 맞췄습니다.");
			}else if(pcRandom>userExpect) {
				System.out.println("오답입니다. 입력한 숫자보다 큰 수입니다. \n숫자를 다시 입력 해 주세요. :");
				
			}else {
				System.out.println("오답입니다. 입력한 숫자보다 작은 수입니다.");				
			}
		}
	}

}
