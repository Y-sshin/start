package day05.ex;

/*
	Ex02 ]
		'A' 부터 문자를 10개를 만들어서 출력하세요.
 */
public class ex0202 {
	public static void main(String[] args) {
		int i =0;
		for(i=0;i<10;i++) {
			char ch = 'A';
			System.out.print((char)(ch+i)+" ");
		}
		System.out.println();
		System.out.println("### i :"+i);
	}

}