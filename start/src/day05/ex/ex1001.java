package day05.ex;

/*
	문제 10 ]
		주사위 2개를 던질 경우 눈의 합이 6이 되는 경우를 모두 출력하세요.
 */
public class ex1001 {
	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(i+j==6) {
					System.out.println("i의 값 :"+i+", j의 값 :"+j+", 두 수의 합 :"+(i+j));
				}
			}
		}
	}

}
