package day07;
/*
	1부터 10까지 정수를 순서대로 배열에 기억
	이 숫자를 랜덤하게 섞어서 출력되게
*/
public class Test06 {
	public static void main(String[] args) {
		int[] num = new int[10]; //1부터10을 기억하는 배열
		for(int i = 0 ; i < 10 ; i++) {
			num[i] = i+1;
		}			//이제 배열은 준비가 완료
		//임의의 숫자 두개를 위치를 랜덤하게 만들어서
		//두 위치의 데이터를 서로 바꾸면 댄다. ->swapping
		for(int i = 0 ; 1 < 100 ; i++) {
			int idx1 = (int)(Math.random()*10);
			int idx2 = (int)(Math.random()*10);
			if(idx1==idx2) {
				i--;
				continue;
			}
			//원래 위치의 데이터를 변수에 기억시키고
			int tmp = num[idx1];
			//두번째 위치의 데이터를 첫번째 위치에 기억시킨다.
			num[idx1]=num[idx2];
			num[idx2]=tmp;
			for(int no : num) {
				System.out.print(no+" | ");
			}
			
		}
	}

}
//깃에서 받아서 선생님 코드 다시볼것