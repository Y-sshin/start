package day08;
/*
	문자열 다섯개를 입력할 배열을 만들고 보기를 입력해 놓고 문제와 같이 화면에 출력하고
	사용자가 정답을 입력하도록 해서 답안이 맞았는디 확인하는 프로그램을 작성하세요
*/
import java.util.*;
public class Test07 {

	public static void main(String[] args) {
		String quest = "다음 중 블랙핑크의 맴버가 아닌 사람은?";//문제변수
		String[] ans = new String[5];//보기변수
		ans[0]="제니";//보기입력
		ans[1]="둘리";//보기입력
		ans[2]="리나";//보기입력
		ans[3]="로제";//보기입력
		ans[4]="지수";//문제완성
		int dap = 1;//정답 위치값 변수		
		System.out.println();//공백추가
		System.out.println(quest);//문제완성 되었음
		for(int i = 0 ; i < ans.length ; i++){//보기 출력
			System.out.println("\t"+(i+1)+")"+ans[i]);
		}
		Scanner sc = new Scanner(System.in);//입력도구 준비
		System.out.print("선택번호 : ");//입력메세지
		int no = sc.nextInt()-1;//입력받은 후 변수에 기억
		String result = no==dap?"정답":"오답";//정답과 비교해서 결과 출력하기
		System.out.println("선택한 맴버 "+ans[no]+"는"+result+"입니다");//결과 출력
		
	}

}
