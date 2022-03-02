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
		System.out.println("첫번째 문제");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print(i+1 + " ");
			}
			System.out.println();
		}
	}
}