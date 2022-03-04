package day03;

public class Test03 {
	public static void main(String[] args) {
		System.out.println('J' + 3.14);
		//'J'이후의 열번째 문자 출력
		System.out.println("'J' 이후의 열번째 문자 : " + (char)('J'+10));
	for(int i = 0 ; i < 3 ; i++) {
		System.out.print("J+"+i+" 번 :"+(char)('J'+i)+"\t");
	}
	}
}
