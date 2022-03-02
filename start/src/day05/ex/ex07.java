package day05.ex;

/*
	문제 7 ]
		5자리의 숫자를 입력한 후
		각자리의 수의 합을 구하는 프로그램을 작성하세요.
		***** %10 을 하여 마지막자리(일의자리) 만 꺼내고
		***** /10 을 하여 앞의 4자리만 남긴다.
		이것을 반복
 */
import java.util.*;
public class ex07 {
	public static void main(String[] args) {
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//메세지 출력
		System.out.print("5자리 정수입력");
		//입력받고 기억
		int no = sc.nextInt();
		int sum = 0;
		int tmp = no;
		//반복해서 합 구하기
		for (int i = 0 ; i < 5 ; i++) {
			sum += tmp%10;
			tmp = tmp/10;
		}
		//결과 출력
		System.out.println("입력한 수 "+ no +"의 각 자릿수의 합은"+ sum +"입니다.");
	}

}
