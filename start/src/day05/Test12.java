package day05;
//구구단 출력
public class Test12 {
	public static void main(String[] args) {
		for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.print(i + " X " + j + " = " + i*j + "\t");
			}
			System.out.println();
		}
	}

}
