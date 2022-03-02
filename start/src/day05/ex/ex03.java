package day05.ex;

/*
	 문제 3 ]
	 	
	 	문자열을 입력받아서
	 	문자를 한글자씩 추출해서 출력하세요.
	 	
	 	참고 ]
	 		문자열의 길이를 알아내는 방법
	 			
	 			int 변수 = 문자열.length();
 */
import javax.swing.*;
public class ex03 {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("문자열을 입력하세요 :");	//문자열 입력 받아서 기억하기.
		int len = str.length();												//입력받은 문자열의 길이 알아냄
		for(int i=0;i<len;i++) {											//길이만큼 반복하여 한글자씩 추출, 출력
			char ch = str.charAt(i);
			System.out.print((i+1)+"번째 문자"+ch+",\t");
			if(i%5==0&i!=0) {
				System.out.println();
			}
		}
	}

}
