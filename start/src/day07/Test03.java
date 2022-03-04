package day07;
/*
 	10개의 문자를 기억할 배열을 만들고 'A'부터 'J'까지 차례로 입력한 후 출력하세요
 */
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
		char[] ch = new char[10];	//char ch[];
									//ch = new char[10];  <- 와 같음
		//각 방에 차례로 접근하여 하나씩 문자를 채운다.
		for(int i = 0 ; i < ch.length ; i++) {
			//문자 만들고
			char munja = (char)('A' + i);
			//만들어진 문자를 배열에 채워 넣는다.
			ch[i] = munja;
			
		}
		//배열의 내용을 확인
		System.out.println(Arrays.toString(ch));
		//하나씩 꺼내서 출력
		for(char munja : ch) {
			System.out.print(munja+" | ");
		}
	} 

}