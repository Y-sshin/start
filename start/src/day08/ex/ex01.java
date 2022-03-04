
package day08.ex;
/*
	7학생의 5과목 점수를 랜덤하게 만들어서 기억 시키고
	각 학생 배열의 맨 마지막에는 총점을 계산해서 입력되게 하고
	결과를 출력하는데 평균도 계산해서 출력하세요
*/
public class ex01 {

	public static void main(String[] args) {//
		int[][] stuScore = new int[7][6];
		for(int i = 0 ; i < stuScore.length ; i++) {
			for(int j =  0 ; j < stuScore[i].length-1 ; j++) {
				stuScore[i][j] = (int)(Math.random()*90+10);//두자릿수만 나오게끔 세팅
			}
		}
		for(int i = 0 ; i < stuScore.length ; i++) {
			int sumScore = 0;
			for(int j = 0 ; j <stuScore[i].length ; j++) {
				sumScore += stuScore[i][j];
			}
			stuScore[i][stuScore[i].length-1] = sumScore; 
		}
		for(int i = 0 ; i < stuScore.length ; i ++) {
			System.out.print((i+1)+"번 학생 성적 : ");
			for(int j = 0 ; j < stuScore[i].length-1 ; j++) {
				System.out.print((j+1)+"번째 과목 :"+stuScore[i][j]+"점 ");
			}
			System.out.print((i+1)+"번 학생 총점"+stuScore[i][stuScore[i].length-1]);
			System.out.println();
		}
		
		int[][] revScore = new int[5][8];
		for(int i = 0 ; i < revScore.length ; i++) {
			for(int j = 0 ; j < revScore[i].length-1 ; j++) {
				revScore[i][j] = stuScore[j][i];
			}
		}
		for(int i = 0 ; i < revScore.length ; i++) {
			int sumRevScore = 0;
			for(int j = 0 ; j <revScore[i].length-1 ; j++) {
				sumRevScore += revScore[i][j];
			}
			revScore[i][revScore[i].length-1] = sumRevScore;
		}
		for(int i = 0 ; i < revScore.length ; i++) {
			System.out.print((i+1)+"번째 과목 : ");
			for(int j = 0 ; j < revScore[i].length-1 ; j++) {
				System.out.print((j+1)+"번 학생"+revScore[i][j]+"점 ");
			}
			System.out.print((i+1)+"번째 과목에 대한 총점"+revScore[i][revScore[i].length-1]);
			System.out.println();
		}
		
		
	}//
}














