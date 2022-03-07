package day09.ex;
/*
	10 학생의 국거 영어 수학 점수를 랜덤하게 입력 받아서 총점과 석차를 구하는 프로그램을 작성하세요
	각 학생의 점수입력, 총점계산, 석차계산, 출력은 함수로 처리하세요
*/
public class ex05 {
	public ex05() {
		int[][] stud = new int[10][5];
		getArr(stud);
		//getRank(stud);  <- 석차 못함 보류 질문드릴 것
		toPrint(stud);
	}
	public static void main(String[] args) {
		new ex05();
	}
	
	public void getArr(int[][] x) {//int[][] 배열에 과목 점수를 채워넣는 함수. 총점까지 작성, 석차는 채우지 않음
		for(int i = 0 ; i < x.length ; i++) {
			int sum = 0;
			for(int j = 0 ; j < 3 ; j++) {
				x[i][j] = (int)(Math.random()*41+60);
				sum += x[i][j];
			}
			x[i][x[i].length-2] = sum;
		}
	}
	
	//석차계산함수 <- 질문
	
	public void toPrint(int[][] x) {//출력 해주는 함수
		System.out.println("학생들의 성적");
		for(int i = 0 ; i < x.length ; i++) {
			System.out.print((i+1)+"번 학생의 성적 ");
			for(int j = 0 ; j < x[i].length-2 ; j++) {
				System.out.print((j+1)+"번 과목 점수"+x[i][j]+", ");
			}
			System.out.print((i+1)+"번 학생의 총점"+x[i][x[i].length-2]+"점");
			System.out.println();
		}
	}

}