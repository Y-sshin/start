package day04;
/*
  정수 하나를 입력받아서 이 수가 0인지, 홀수인지, 짝수인지 판별하세요.
  조건문 if문을 사용
  if(조건식){
  실행내용 // 괄호 안의 조건식이 참인경우 실행내용 부분이 실행 
  }
 */
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//입력도구 준비
		System.out.print("정수입력: ");//입력메세지 출력
		int num = sc.nextInt();//입력받아 정수를 변수에 기억
		String soo = "[영]";//입력받은 정수가 0인지 판별하기 위한 도구
		
		//홀수인 경우
		if(num%2!=0) {
			soo = "홀수";
		}
		
		//짝수인 경우, 0인 경우
		if(num!=0 && num%2==0){
			soo = "짝수";
		}
		
		System.out.println("입력받은 정수 " + num + "은 " + soo + "입니다.");//내용출력 조건에따라서 판별
	}
}
