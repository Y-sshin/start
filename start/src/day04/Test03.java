package day04;
//시프트연산
public class Test03 {
	public static void main(String[] arg) {
		int no =20;
		int result = no >> 2;
		System.out.println("result :" + result);
		
		result = result << 3;
		System.out.println("result :" + result);
		
		System.out.println("<<1 :" + (-64>>1));
		System.out.println(">>>1 :" + (-64>>>1));
	}
}
