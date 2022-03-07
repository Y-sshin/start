package day09.ex;
/*
	문제3
	사각형의 넓이를 계산하는 프로그램을 작성하세요
	길이를 랜덤하게 만들어 주는 함수, 넓이를 계산해주는 함수
	사각형의 내용을 출력해주는 함수
	
*/
public class ex03 {
	public ex03() {
		System.out.println("밑변과 높이를 각각 생성합니다.");
		int no1 = ga();
		int no2 = ga();
		int ar1 = area(no1, no2);
		toPrint(no1, no2, ar1);
	}
	public static void main(String[] args) {//높이와 밑변의 길이가 다른 직사각형으로한다.
		new ex03();
	}
	
	//한 변의 길이를 랜덤하게 만들어주는 함수
	public int ga() {
		return (int)(Math.random()*100+1);
	}
	
	//사각형의 넓이 계산함수
	public int area(int x, int y) {
		return x*y;
	}
	
	//출력해 주는 함수
	public void toPrint(int p1, int p2, int p3) {
		System.out.print("임의로 생성된 밑변 ["+p1+"] 과 높이 ["+p2+"] 를 갖는 사각형의 넓이는 ["+p3+"] 입니다.");
	}
}
