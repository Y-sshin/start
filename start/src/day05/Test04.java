package day05;
/*
 	나이를 입력받아서 유년기, 10, 20, 30, 40, 장년층으로 구분해서 출력
 */
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//입력도구
		System.out.print("나이를 입력하세요 :");//메세지를 출력
		int age = sc.nextInt();//입력받은 나이를 변수에 기억
		
		String sage = "유년기";
		
		if(age<10) {
		}else if(age<20) {
			sage = "10대";
		}else if(age<30) {
			sage = "20대";
		}else if(age<40) {
			sage = "30대";
		}else if(age<50) {
			sage = "40대";
		}else {
			sage = "장년층";
		}
		System.out.println(sage + "입니다.");
	}

}
