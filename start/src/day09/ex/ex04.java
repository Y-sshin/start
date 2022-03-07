package day09.ex;
/*
	1차원 배열에 정수 10개를 입력한 후 합계와 평균을 구해주는 프로그램을 작성학세요ㅕ
	배열에 정수를 랜덤하세 채워주는 함수, 합계를 계산해주는 함수, 평균을 계산해주는 함수, 출력해주는 함수
*/
public class ex04 {
	public ex04() {
		int[] arr1 = new int[10];
		getArr(arr1);//배열에 숫자를 채우는 함수
		toPrint(arr1);
	}
	public static void main(String[] args) {
		new ex04();
	}
	
	public void getArr(int[] x) {//int배열에 숫자를 채워주는 함수
		for(int i = 0 ; i < x.length ; i++) {
			x[i] = (int)(Math.random()*100 +1);
		}
		return;
	}
	
	public int arrSum(int[] x) {//int배열 안에 있는 값들을 합계를 계산 후 반환해 주는 함수
		int result = 0;
		for(int i = 0 ; i < x.length ; i++) {
			result += x[i];
		}
		return result;
	}
	
	public int arrMean(int[] x) {//int배열 안에 있는 값들의 평균을 계산 후 반환해 주는 함수
		int result = 0;
		int sum = arrSum(x);
		result = sum/x.length;
		return result;
	}
	
	public void toPrint(int[] x) {
		System.out.println("배열의 각 값들은");
		for(int i = 0 ; i < x.length ; i++) {
			System.out.print(x[i]+", ");
		}
		System.out.println();		
		System.out.print("입니다.\n배열의 값들의 합은 "+arrSum(x)+"입니다. 배열의 값들의 평균은 "+arrMean(x)+"입니다.");
		
	}
	
}
