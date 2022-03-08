package day10;

public class Test01_01 {
	/*
		Test01클래스에 접근해서 데이터를 읽어보자
	*/
	private int num1, num2, num3, num4;
	
	//Test01에 있는 변수내용 읽어와서 전역변수 세팅해주는 함수
	public void getNo() {
		Test01 t1 = new Test01();//Test01의 내용,멤버를 사용하려면 먼저 Heap영역에 클래스의 내용을 복사해줘야 한다. 그 작업은 new라는 명령을 통해 이루어진다.
	  //num1 = t1.no1;//no1의 접근지정자는 Test01 클래스 내에서만 사용할 수 있도록 private로 지정되어있기 때문에 불러올수 없음.
		num2 = t1.no2;//Test01클래스와 같은 패키지(폴더) 내에 있으므로 접근지정자가 생략된 경우 이상은 모두 사용가능하다.
		num3 = t1.no3;//같은 패키지 내 이기 때문에 사용가능하다.
		num4 = t1.no4;//no4의 접근지정자가 모든 곳에서 접근 가능하도록 public으로 지정되어있다.
	}
}
