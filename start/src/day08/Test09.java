package day08;
/*
	+ , - , * , / 연산을 하는연산식을 입력하면 결과를 보여주는 계산기 프로그램을 작성
	단, 연산식을 문자열 배열에 담아서 처리하세요
	연산기호가 오는 위치 이전까지 문자열을 잘라서 첫번째 기억시키고
	연산기호를 두번째에 기억시키고 나머지를 마지막에 기억시켜서 처리
*/
import java.util.*;
public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//입력도구 준비
		System.out.print("계산식을 입력하세요 :");//메세지출력
		String str = sc.nextLine();//입력받아서 할당
		String[] sik = new String[3];//배열 준비
		//배열에 문자열 잘라서 집어넣고
		int idx = 0;//연산기호의 위치값을 기억할 변수
		for(int i = 0 ; i <str.length() ; i++){//반복
			char ch = str.charAt(i);
			if(ch<'0'||ch>'9') {//이 경우 추출한 문자는 숫자형태가 아님
				idx=i;
				break;
			}
		}
		sik[0] = str.substring(0,idx);
		sik[1] = str.substring(idx,idx+1);                                            //str.charAt(idx) +""  <-???이해안댐
		sik[2] = str.substring(idx+1); 

		int no1 = Integer.parseInt(sik[0]);//계산
		int no2 = Integer.parseInt(sik[2]);//계산
		double result = 0.0;
		switch(sik[1]) {
			case "+":
				result = no1 + no2;
				break;
			case "-":
				result = no1 - no2;
				break;
			case "*":
				result = no1 * no2;
				break;
			case "/":
				result = no1 / (double)no2;
				break;
		}
		System.out.println("입력한계산식\n\t"+"\n의 결과는 \n\t"+result);//결과 출력
		
		
	}

}
 