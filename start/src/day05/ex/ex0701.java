package day05.ex;

/*
	문제 7 ]
		5자리의 숫자를 입력한 후
		각자리의 수의 합을 구하는 프로그램을 작성하세요.
 */
import java.util.*;
public class ex0701 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5자리 숫자를 입력해 주세요 :");
		int no = sc.nextInt();
		int result = 0;
		for(int i = 5; i>0 ; i--){
			int num = 0;
			for(int j = 0 ; j < i ; j++) {
				num = no/10;
				if(j==i-1) {
					int je = 1;
					for(int k=1;k<i-1;k++) {
						je = je*10;
					}
					no = no%je;
				}
			}
			result = result + num;
		}
		System.out.println(result);
	}

}
