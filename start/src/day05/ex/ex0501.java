package day05.ex;

/*
	문제 5 ]
		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
		
		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
		가위, 바위, 보로 가정하고
		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
		
		누가 이겼는지를 확인하는 프로그램을 작성하세요.
		
 */
import java.util.*;
public class ex0501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위는 1 바위는 2 보는 3을 입력하세요. :");
		int user = sc.nextInt();
		if(user==1) {
			user = (char)'찌';
		}else if(user==2) {
			user = (char)'묵';
		}else {
			user = (char)'빠';
		}
		
		System.out.println("PC가 낼 것을 고르는 중..");
		int pc = (int)((Math.random() * 3)+1);
		if(pc==1) {
			user = (char)'찌';
		}else if(pc==2) {
			user = (char)'묵';
		}else {
			user = (char)'빠';
		}
		System.out.println("test" + pc + "," + user);
		if(user==pc) {
			System.out.println("user가 낸 것 :[" + (char)user + "] pc가 낸 것은 :[" + (char)pc + "]으로 서로 비겼습니다.");
		}else if(user=='찌') {
			if(pc=='묵') {
				System.out.println("user가 낸 것 :[" + (char)user + "] pc가 낸 것은 :[" + (char)pc + "]으로 pc가 이겼습니다.");
			}else {
				System.out.println("user가 낸 것 :[" + (char)user + "] pc가 낸 것은 :[" + (char)pc + "]으로 user가 이겼습니다.");				
			}
		}else if(user=='묵') {
			if(pc=='찌') {
				System.out.println("user가 낸 것 :[" + (char)user + "] pc가 낸 것은 :[" + (char)pc + "]으로 user가 이겼습니다.");								
			}else {
				System.out.println("user가 낸 것 :[" + (char)user + "] pc가 낸 것은 :[" + (char)pc + "]으로 pc가 이겼습니다.");												
			}
		}else {
			if(pc=='묵') {
				System.out.println("user가 낸 것 :[" + (char)user + "] pc가 낸 것은 :[" + (char)pc + "]으로 user가 이겼습니다.");																
			}else {
				System.out.println("user가 낸 것 :[" + (char)user + "] pc가 낸 것은 :[" + (char)pc + "]으로 pc가 이겼습니다.");																				
			}
		}
	}

}







