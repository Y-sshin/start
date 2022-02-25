package day03.ex;

import java.util.*;//이렇게 활용할 클래스의 경로를 지정하면 java.util패키지의 하위에 바로속한 클래스만 사용할 준비를 하게된다.
//이 예제의 경우는 Scanner를 사용할 예정인데 직접 * 대신 Scanner로 명시해도 된다. 적용순서는 *보다 클래스 이름을 명시한 것을 우선한다.
public class ex02_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// 입력도구 준비
		System.out.print("반지름: "); // 메세지 출력
		int rad = sc.nextInt();// 입력받은 값을 변수에 입력
		double pi = 3.14;
		double area = rad*rad*pi;// 원의넓이계산 숫자데이터의 연산은 항상 큰 데이터타입으로 결과가나옴
		double arround = 2*pi*rad;// 원의둘레계산
		System.out.println("반지름 : " + rad);// 출력
		System.out.println("넓  이 : " + area);
		System.out.println("둘  레 : " + arround);
		
		int intArea = (int) area;
		int intArr = (int) arround;
		System.out.println(intArea);//참고 ] 형변환에서 큰 타입의 데이터를 작은타입으로 변환하면 남는 부분은 버린다.
		System.out.println(intArr);
		
/*
	A라는 폴더 -abcd.txt, efg.txt
	B라는 폴더 -abcd.txt, xyz.txt
 */
	}

}
