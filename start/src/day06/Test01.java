package day06;

public class Test01 {
	public static void main(String[] args) {
		loop:
		for(int i = 2 ; i < 10 ; i++) {
			for(int j = 1 ; j < 10 ; j++) {
				if(i==5&&j==3) {
					break loop;									//안쪽 j루프에서
				}
				System.out.println(i + "+" + j + "=" + i*j );
			}
		}
	}

}
