package day09;
/*
	두 수를 이용해서 더하는 프로그램을 작성하세요
	단, 입력, 계산, 출력을 함수로 만들어서 처리하세요.
		랜덤하게 숫자를 발생시키는 것도 함수처리
*/
public class Test02 {
	public Test02() {//기본생성자 함수:생성자함수는 반환값, 타입을 기술하면 안된다. 반환값, 타입이 없다.
		int no1 = makeInt();
		int no2 = makeInt();
		int result = calc(no1, no2);
		System.out.print("1.정수 두개 입력 :");
		toPrint(no1,no2);//1번 형태
		System.out.print("2.정수 두개 입력 :");
		toPrint(no1,no2,result);//2번 형태
		
	}
	public static void main(String[] args) {
		new Test02();
	}
	
	public void abc() {
		System.out.println("abc함수 호출...");
	}
	public int makeInt() {//1~100사이의 랜덤한 정수를 발생시켜서 반환해주는 함수
		//여기서 속성은 사용하지 않았음, 속성은 필요할 때만 사용할 것이다.
		int no = 0;//반환값 변수
		no = (int)(Math.random()*100+1);//랜덤하게 정수 만들어서 채우기
		return no;//반환값 내보내기
	}
	public int calc(int no1,int no2) {//두 수를 입력 받아서 계산해주는 함수//매ㅂ개변수는 여러개가 입역되면,  컴마 단위로 나열한다.
		//int result = 0;//반환값 변수
		//이 함수를 실행할 때 입력된 두 정수는
		//no1, no2변수에 기억될 것이다. 이 변수에 기억된 데이터를 계산 하면 된다.
		//result = no1+no2;
		//return result;//1실행중인 이 함수를 즉시 종료하세요
		return no1+no2;
	}
	
	
	
	//두 수와 결과를 입력해주면 계산결과를 출력해주는 함수
	//매개변수 리스트에 정의된 변수는 블럭 내에서만  지역변수
	//함수의 오버로딩(함수의 중첩)
	/*
			함수의 오버로딩
				같은 이름으로 함수를 한 클래스 내에 추가하는 방법
			원칙
				0.함수에 오버로딩 하려는 함수가 있어야 한다.
				1.함수이름이 같아야 한다.
				2.매개변수 리스트가 달라야 한다.(매개변수리스트의 타입, 순서, 갯수 중 하나 이상이 달라야 한다.)
				2-1. 이런경우는 허용되지 않는다.
					void abc(int a, int b){}
					void abc(int b, int a){} -> 매개변수 리스트의 형태는 데이터의 타입으로 판별함
				3.반환값 타입과는 무관하다.
				
	 */
	public void toPrint(int no1, int no2) {//두 수를 입력해주면 두 수의 계산결과를 출력해주는 함수
		int num1 = no1;
		int num2 = no2;
		int result = calc(num1,num2);
		System.out.println("두 정수 "+num1+" 과 "+num2+" 의 합은 "+result+"입니다.");//출력
		return;//기술하지 않아도 실행 내용을 모두 실행했으므로 이 함수가 자동 종료된다.
	}
	public String toPrint(int no1, int no2, int no3) {
		System.out.println("두 정수 "+no1+" 과 "+no2+" 의 합은 "+no3+"입니다.");
		return null;
	}

}
