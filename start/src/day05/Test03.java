package day05;

import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//입력받을 준비
		System.out.println("정수입력 :");//입력메세지 출력
		int no = sc.nextInt();//입력받아서 변수에 기억시킨다.
		String result = "정수";
		if(no==0) {
			result = "0";//no가0인경우
		}else {
			if(no%2==0){//no가0이아닌경우
				result = "짝수";//no가 짝수인 경우
			}else {
				result = "홀수";//no가 홀ㅏㅁ자671수인 경우
			}
		}
		System.out.println("입력한 정수 " + no + "는 " + result + "입니다....");
}
}