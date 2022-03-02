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
public class ex06 {
	public static void main(String[] args) {
		//할일
		//1.입력도구 준비
		Scanner sc = new Scanner(System.in);
		//2.랜덤한 숫자 만들고
		int num = (int)(Math.random()*100+1);
		//3.반복해서 처리
		for(int i = 0 ; i < 5 ; i++){//횟수제한이 있기때문에 카운터 변수가 있는 for 반복문을 사용하도록
			 System.out.print("숫자입력:");
			 int no = sc.nextInt();
			 if(no==num) {
				 System.out.println("입력한 수 "+no+"맞습니다.");
				 //정답이므로 반복 종료
				 break;
			 }else if(i!=4&&no>num) {
				 System.out.println("큰 수를 입력했음");				 
			 }else if(i!=4&&no<num) {
				 System.out.println("작은 수를 입력했음");				 				 
			 }else if(i==4) {
				 System.out.println("게임 졌음");
				 System.out.println("pc는"+num+"을 골랐음");
				 break;
			 }
		}
		//3-1. 사용자가 숫자를 입력한다.
		
		//3-2. 비교해서 결과 보여준다.
		//
	}

}
