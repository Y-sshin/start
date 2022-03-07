package day06.ex;
/*
 	(전체 중첩된 for 명령으로, 반드시 두개 쓸 것)
 	1 1 1 1 1
 	2 2 2 2 2
 	3 3 3 3 3
 	4 4 4 4 4
 	5 5 5 5 5
 	출력
 	1 2 3 4 5
 	1 2 3 4 5
 	1 2 3 4 5
 	1 2 3 4 5
 	1 2 3 4 5
 	출력
 	1 2 3 4 5
 	2 3 4 5 6 
 	3 4 5 6 7 
 	4 5 6 7 8 
 	5 6 7 8 9
 	출력
 	1  2  3  4  5
 	6  7  8	 9	10
 	11 12 13 14 15
 	16 17 18 19 20
 	21 22 23 24 25
 	출력
 	1
 	1 2
 	1 2 3
 	1 2 3 4
 	1 2 3 4 5
 	출력
 	1
 	2  3
 	4  5  6
 	7  8  9  10
 	11 12 13 14 15
 	출력
 */
public class ex03 {
	public static void main(String[] args) {
		System.out.println("첫번째");
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				System.out.print(i+" ");
			}
			System.out.println();			
		}
		
		
		System.out.println("두번째");
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

		
		System.out.println("세번째");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 1+i ; j <= 5+i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("네번째");
		for(int i = 0 ; i <= 20 ; i=i+5) {
			for(int j = 1+i ; j <= 5+i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("다섯째");
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				if(j>i)continue;
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("여섯째");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 1+i ; j <= 5+i ; j++) {
				if(j>i+i+1)continue;
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}






















