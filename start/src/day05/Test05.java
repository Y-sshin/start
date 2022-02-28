package day05;
/*
	나이를 입력받아서 유년기, 10, 20, 30, 40, 장년층으로 구분해서 출력
*/
import java.util.*;
public class Test05 {
	public static void main() {
		Scanner sc = new Scanner(System.in);//입력도구 준비
		System.out.print("나이를 입력하세요 :");
		int age = sc.nextInt();
		String sage = "장년층";
		int gen = age/10*10;
		switch(gen){
		case 0:
			sage = "유년기";
			break;
		case 1:
			sage = "10대";
			break;
		case 2:
			sage = "20대";
			break;
		case 3:
			sage = "30대";
			break;
		case 4:
			sage = "40대";
			break;
		default :
			sage = "장년층";
		}
		System.out.println("입력한 나이 :"+age+"는"+sage+"입니다.");
	}
}
