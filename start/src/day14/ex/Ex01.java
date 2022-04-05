package day14.ex;
/*
	문제 1 ]
		원의 정보를 기억할 클래스를 제작하세요.
		가지는 정보는 
			반지름, 면적, 둘레
		를 가지고
		기능은 변수에 접근할 수 있는 함수들..
		그리고 반지름이 같으면 같은 원으로 처리해주는 기능의 
			equals()
		함수로 오버라이드 하고,
		이클래스 타입의 변수를 출력하면 해당 원의 정보를 출력해주는 함수도 오버라이드 하세요.
 */

import java.util.*;
public class Ex01 {
	int rad;
	Scanner sc = new Scanner(System.in);
	public Ex01() {
		System.out.println("첫 번째 원의 반지름을 입력 :");
		rad = sc.nextInt();
		Won o1 = new Won(rad);
		
		System.out.println("두 번째 원의 반지름을 입력 :");
		rad = sc.nextInt();
		Won o2 = new Won(rad);
		
		System.out.println(o1+"은 "+o1.toString());
		System.out.println(o2+"는 "+o2.toString());
		if(o1.equals(o2)) {
			System.out.println("두개의 원 o1과 o2는 같은 원입니다.");
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
