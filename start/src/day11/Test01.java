package day11;

public class Test01 {
	int no1 = 10; //명시적 초기화
	
	int no2;
	//no2 = 100;<- 클래스 블럭 바로 아래에서는 일반 명령x 선언만 가능
	{
		no1 = 1;
		no2 = 100;//<-초기화 블럭을 이용한 초기화 방법
	}
	
	public Test01() {
		System.out.print(no1);
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
