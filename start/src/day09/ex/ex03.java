package day09.ex;
/*
	문제3
	사각형의 넓이를 계산하는 프로그램을 작성하세요
	길이를 랜덤하게 만들어 주는 함수, 넓이를 계산해주는 함수
	사각형의 내용을 출력해주는 함수
	
*/
public class ex03 {
	int garo;
	public ex03() {
		setGaro();
		System.out.print(garo);
	}
	public static void main(String[] args) {
		new ex03();
	}
	public void setGaro() {
		garo = (int)(Math.random()*45+1);
	}

}
