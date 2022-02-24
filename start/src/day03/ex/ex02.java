package day03.ex;
/*
	하나의 숫자를 입력받은 후 그 숫자를 이용하여 원의 넓이와 둘레를 계산하고 출력하라
 */
import java.util.*;
public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하여 원의 넓이와 둘레를 계산합니다.");
		System.out.print("원의 반지름을 입력하세요(cm) : ");
		int ban = sc.nextInt();
		double dool = ban*2*3.14; 
		double noel = ban*ban*3.14;
		System.out.println("원의 반지름이 " + ban + "(cm)인 원의 둘레의 길이는 :" + dool + "이고,");
		System.out.println("원의 반지름이 " + ban + "(cm)인 원의 넓이는 :" + noel + "이다.");
	}
}
