package day05.ex;

/*
	문제 4 ]
		전기요금을 계산해주는 프로그램을 작성하세요.
		
		전기요금표
			
						코드		기본요금		사용요금
			가정용		1			3800			245
			산업용		2			2400			157
			교육용		3			2900			169
			상업용		4			3200			174
			
			
		전기요금은 
			기본요금 + 사용량 * 사용요금
			
		사용자 코드와 사용량을 입력하면
		전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
 */
import java.util.*;
public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);																			//입력도구 준비
		System.out.print("사용하시는 고객 코드를 입력해 주세요(숫자1~4) :");											//코드요청 메세지 출력
		int code = sc.nextInt();
		if(code==1) {
			System.out.print("가정용 전기요금에 대한 안내입니다. 아파트의 계량기의 숫자를 입력해주세요(Kw) :");			//가정용 계량기 수치요청 메세지 출력
		}else if(code==2){
			System.out.print("산업용 전기요금에 대한 안내입니다. 사업장 내의 계량기의 숫자를 입력해주세요(Kw) :");		//산업용 계량기 수치요청 메세지 출력
		}else if(code==3){
			System.out.print("교육용 전기요금에 대한 안내입니다. 교육원 내의 계량기의 숫자를 입력해주세요(Kw) :");		//교육용 계량기 수치요청 메세지 출력
		}else if(code==4){
			System.out.print("상업용 전기요금에 대한 안내입니다. 상가 내의 계량기의 숫자를 입력해주세요(Kw) :");		//상업용 계량기 수치요청 메세지 출력
		}
		float watt = (float)sc.nextDouble();																			//더블형으로 입력 받은 수 float로 강제형변환
		System.out.println("입력하신 코드는 [" + code + "], 이번 달 사용량은 [" + watt + "Kw] 입니다.");				//사용자 코드와 사용량 확인 메세지 출력
		switch(code) {																									//스위치문, 1:가정,2:산업,3:교육,4:상업용
		case 1 :																										//
			System.out.println("가정용 전기의 기본요금은 3800원, 이번 달 사용요금은 " + 245*watt + "원 입니다. 총 요금은 " + (3800+(245*watt)) + "입니다.");
			break;
		case 2 :
			System.out.println("산업용 전기의 기본요금은 2400원, 이번 달 사용요금은 " + 157*watt + "원 입니다. 총 요금은 " + (2400+(157*watt)) + "입니다.");
			break;
		case 3 :
			System.out.println("교육용 전기의 기본요금은 2900원, 이번 달 사용요금은 " + 169*watt + "원 입니다. 총 요금은 " + (2900+(169*watt)) + "입니다.");
			break;
		case 4 :
			System.out.println("상업용 전기의 기본요금은 3200원, 이번 달 사용요금은 " + 174*watt + "원 입니다. 총 요금은 " + (3200+(174*watt)) + "입니다.");
			break;
		}
	}

}
