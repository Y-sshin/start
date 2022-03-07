package day09.ex;
/*
	문제2
	반지름 하나를 랜덤하게 입력한 후 원의 넓이, 원의 둘레를 계산해서 출력하는 프로그램을 작성하세요
	반지름 랜덤생성 함수, 넓이 계산함수, 출력을 해주는 함수
*/
public class ex02 {
	public ex02() {
		System.out.println("반지름을 생성합니다 :");
		int radi = ranRad();
		double rou = getRound(radi);
		double are = getArea(radi);
		toPrint(radi, rou, are);
		
	}
	public static void main(String[] args) {
		new ex02();
	}
	
	public int ranRad(){//랜덤하게 반지름 생성(더블형)
		int r1 = 0;
		r1 = (int)(Math.random()*100+1);
		return r1;
	}
	
	public double getRound(double x) {//double형 변수 받아서 원의 둘레 계산  <- 이 함수의 매개변수는 더블, 생성되어 입력된 값은 int , 오류날 것이라 예상 했는데 안남
		return x*2*3.14;
	}

	public double getArea(double x) {//double형 변수 받아서 원의 넓이 계산
		return x*x*3.14;
	}
	
	public void toPrint(int p1, double p2, double p3) {//출력 해주는 함수
		System.out.print("임의 생성된 반지름 ["+p1+"] 으로\n만들어진 원의 둘레는 ["+p2+"] 이고, 원의 넓이는 ["+p3+"] 이다.");
	}
}
