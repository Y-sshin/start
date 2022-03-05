package day05;

public class Test11 {
	//구구단 5단을 출력, 곱이 5인 경우는 제외하고 출력
	public static void main(String[] args) {
		int dan = 5;
		for (int i = 0 ; i <9 ; i++) {
			if(i+1 == 5)continue;
			System.out.println(dan + "X" + (i+1) + "=" + (dan*(i+1)));
		}
	}

}
