package day08;
/*
	세명의 학생의 java, web, DB, jsp, spring 점수를 기억할 변수를 만들고 각 과목의 점수를 랜덤하게 만들어서 입력하고 결과를 출력하는 프로그램
*/
public class Test11 {

	public static void main(String[] args) {
		int[][] stud = new int[3][5];
		//점수입력
		for(int i = 0 ; i < stud.length ; i++) {//학생선택
			for(int j = 0 ; j < stud[i].length ; j++) {//학생의 과목선택
				stud[i][j] = (int)(Math.random() * 41 + 60);//과목 점수 랜덤입력
			}
		}
		
		System.out.println();
		System.out.println("###");
		for(int i = 0 ; i < stud.length ; i++) {
			for(int j = 0 ; j <stud[i].length ; j++) {
				System.out.print(stud[i][j]+" | ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("###");
		//총점구하기
		int[] total = new int[3];
		for(int i = 0 ; i < stud.length ; i ++) {
			for(int j = 0 ; j < stud[i].length ; j++) {
				total[i] += stud[i][j];
			}
		}
		for(int t : total){//출력
			System.out.println("###"+t);
		}
	}

}
