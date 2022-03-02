package day05.ex;

/*
	문제 5 ]
		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
		
		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
		가위, 바위, 보로 가정하고
		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
		
		누가 이겼는지를 확인하는 프로그램을 작성하세요.
		
				컴퓨터
				1	  2		3
		사람 1	0	  1		2
			 2	-1	  0		1
			 3	-2	  -1	0
		컴퓨터 빼기 사람 으로 계산하여 진행
		비긴경우는 결과값0 
		컴퓨터가 이긴경우 1,-2
		사람이 이긴경우 -1,2
 */
import java.util.*;
public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력도구 준비
		while(true) {
			System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요.\n프로그램 종료는 0을 입력하세요\n-------------------------");		//입력메세지 출력
			int saram = sc.nextInt();																			//입력받아서 변수에 기억
			if(saram==0){																						//입력된 숫자가 종료숫자이면 바로 종료시킨다.
				sc.close();
				break;
			}
			String sstr = "가위";					//컴퓨터와 사람의 코드에 따라서 가위 바위 보를 기억할 변수
			switch(saram) {
			case 1:
				sstr = "가위";
				break;
			case 2:
				sstr = "바위";
				break;
			case 3:
				sstr = "보";
				break;
			default:
				continue;
			}
			
			int samtl = (int)(Math.random() * 3+1);
			
			String comstr = "가위";
			switch(samtl) {
			case 2:
				comstr = "바위";
				break;
			case 3:
				comstr = "보";
				break;
			}
			int result = samtl - saram;
			String msg = "비";
			if(result==1||result==-2){
				msg = "컴퓨터가 이";
				//System.out.print("컴은"+comstr+"사람은"+ sstr +"으로 컴퓨터가 이김");	
			}else if(result==2||result==-1){
				msg = "사람이 이";
				//System.out.print("컴은"+comstr+"사람은"+ sstr +"으로 컴퓨터가 이김");	
			}else {
				//System.out.print("컴은"+comstr+"사람은"+ sstr +"으로 비김");					
			}
		System.out.println("컴퓨터는" +comstr+ "\n사람은" +sstr+ "으로" +msg+ "겼습니다.");
		System.out.println("-----------------------------");
		}
		System.out.println("게임을 종료합니다.");
	}
}
