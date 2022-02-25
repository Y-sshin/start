package day04;
/*
 정수를 입력받아서 짝수인지 홀수인지를 판별하세요 단 0은 짝수로 간주한다.
 */
import java.util.*;
public class Test04 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);//입력도구 준비
		System.out.print("정수를 입력하세요 :");//입력받기전 요청메세지 출력
		int num = sc.nextInt();//자료를 입력받아 벼누에 할당
		String result = (num%2==0)?("짝수"):("홀수");//짝수인지 홀수인지 판별
		System.out.println("입력받은 숫자 :" + num + "은 " + result + " 입니다.");//출력하기
	}
}
