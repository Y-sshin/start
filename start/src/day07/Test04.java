package day07;
/*
	5과목의 점수를 기억할 변수를 만들고 과목점수를 입력하여 총점과 평균을 구하고 출력하세요
	배열에 담긴 점수도 같이 출력하세요.
 */
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		//과목점수 배열
		int[] subj = new int[5];
		//과목점수를 랜덤하게 만들어서 입력한다.
		for(int i = 0 ; i < subj.length ; i++) {
			//랜덤하게 만든 점수를 각 과목의 방에 입력한다.
			/*
			  int score = (int)(Math.random()*(100-60+1)+60);
			  subj[i] = score;
			 */
			subj[i] = (int)(Math.random()*(100-60+1)+60);
		}
		//총점을 계산
		int total = 0;
		for(int i = 0 ; i < subj.length ; i++) {
			int score = subj[i];
			//총점에 과목점수를 누적시킨다.
			//total = total + score;
			total += score;
		}
		//평균 계산
		double avg = (double)(total/subj.length);
		//출력
		System.out.println("각 과목 점수 :" +Arrays.toString(subj));
		System.out.println("총 점수 :" +total);
		System.out.println("평균 :" +avg);
	}

}
