package day05.ex;

/*
	Ex02 ]
		'A' 부터 문자를 10개를 만들어서 출력하세요.
 */
public class ex02 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			char ch = (char)(Math.random() * ('Z' - 'A' + 1)+'A');
			System.out.print(ch + " ");
		}
	}

}