package day06.ex;
/*
 	3~100 사이의 정수를 입력받아서 그 숫자가 소수인지 판단하는 프로그램을 작성하세요
 	참고]
 		소수는 1과 자기자신으로만 나누어지는 수
 	
 	보너스]
 	3부터 100 사이의 숫자 중 소수만 모두 출력하세요
 */
public class ex01 {
	public static void main(String[] args) {		
		loop:
		for(int i = 3 ; i < 300 ; i++) {
		for(int j = 2 ; j<=i ; j++) {
			if(i!=j&&i%j==0) {
				continue loop;
			}else if(i==j&&i%j==0){
				System.out.print(i+",");
				}
			}
		}
	}
}

