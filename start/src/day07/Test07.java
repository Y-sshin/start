package day07;

import java.util.Arrays;

public class Test07 {

	public static void main(String[] args) {
		//배열 만들고
		int[] num = new int[10];
		//데이터 채우고
		loop:
		for(int i = 0 ; i < num.length ; i++) {
			int no = (int)(Math.random()*99+1);
			//중복검사
			for(int j = 0 ; j < i ; j++) {
				int soo = num[j];
				if(soo==no) {
					//중복되는 경우이므로 숫자생성을 다시반복
					i--;
					continue loop;
				}
			}
			num[i] = no;
		}
		//채워진 내용 확인
		System.out.println(Arrays.toString(num));
		
		//정렬
		for(int i = 0 ; i < num.length-1 ; i++) {
			for(int j = i+1 ; j < num.length ; j++) {
				
				if(num[j]>num[i]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		System.out.print("|");
		for(int no : num) {
			System.out.print(num);
		}
	}

}