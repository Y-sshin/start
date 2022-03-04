package day08;
/*
	문자와 출현 수를 기억할 배열 10개를 관리하는 배열을 만들고
	'A'~'J' 를 랜덤하게 100번 반복하여 만들고
	배열에 기억시켜서 결과를 출력
*/
public class Test12 {
	public static void main(String[] args) {
		int munja[][] = new int[10][2];//문자 열 개의 데이터2개를 관리하는 배열
		/*
		munja[0][0] = 'A';
		munja[1][0] = 'B';
		munja[2][0] = 'C';
		*/
		for(int i = 0 ; i < munja.length ; i++) {
			munja[i][0] = 'A'+i;
		}
		
		//랜덤하게 문자를 100번 발생시켜서 카운트를발생시킨다.
		/*
			'A' => munja[ch-'A'][1] += 1;
		*/
		for(int i = 0 ; i < 100 ; i++) {
			char ch = (char)(Math.random()*('J'-'A'+1)+'A');
			
			int idx = ch-'A';
			//int oldCount = munja[idx][1];
			//int newCount = oldCount + 1;
			//munja[idx][1] = newCount;
			munja[idx][1] += 1;
		}
		for(int i = 0 ; i < munja.length ; i++){//출력
			int[] arr = munja[i];
			char ch = (char) arr[0];
			int count = arr[1];//카운트
			//타이틀출력
			System.out.print(ch+" [ : "+count+"]  :");
			for(int j = 0 ; j < count ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
