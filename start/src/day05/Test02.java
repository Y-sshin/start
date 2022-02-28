package day05;
/*
 	정수를 입력 받아서, 그 숫자가 짝수인지 홀수인지를 판별하세요. 그다음 출력하세요
 	단 0인 경우 0으로 출력 할 것
 */
import java.util.*;
public class Test02 {
	public static void mian(String[] args){
		Scanner sc = new Scanner(System.in);//입력받을 준비
		System.out.println("정수입력 :");//입력메세지 출력
		int no = sc.nextInt();//입력받아서 변수에 기억시킨다.
		String result = "정수";//판별
		if(no==0) {
			result = "0";
		}
		/*
		if(no!=0 && no%2==0) {//짝수의 경우
			result = "짝수";
		}
		
		if(no!=0 && no%2!=0) {
			
		}
		*/
		if(no !=0) {
			if(no%2==0) {
				result = "짝수";
			}
			if(no%2==1) {
				result = "홀수";
			}
		}
		
		
		System.out.println("입력한 정수는 "+ no +"는 " + result +"입니다.");
		
		
		
	}
}
