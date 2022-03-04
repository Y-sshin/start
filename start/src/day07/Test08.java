package day07;
/*
	10개 정수를 랜덤하게 발생시켜서 기억하는 배열을 만듬
	기억된 수 중에 가장 큰 수를 알아내는 프로그램
*/
import java.util.*;
public class Test08 {

	public static void main(String[] args) {
		int[] num = new int[10];
		loop:
		for(int i = 0 ; i < num.length ; i++) {
			int no=(int)(Math.random()*99+1);
			//중복검사
			for(int j = 0 ; j < i ; j++) {
				if(num[j]==num[i]) {
					i--;
					continue loop;
				}
			}
			//중복검사에 통과한 경우
			num[i] = no;
		}
		//데이터확인
		System.out.println("**"+Arrays.toString(num));
		
		
		loop:
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = i + 1 ; j < num.length ; j++) {
				if(num[i]>num[j]) {
					continue;
				}
				if(num[j]>num[i]) {
					i=j;
					continue loop;
				}
				System.out.println(num[i]);				
			}
		}
	}

}