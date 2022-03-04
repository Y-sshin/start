package day08;
/*
	0-9사이의 숫자를 100개 발생시켜서
	각각의 숫자가 몇 번씩 발생했는지를 알아보자
	
*/

public class Test01 {
	public static void main(String[] args) {
		//배열 만들고
		int[] numCount = new int[10];//각 방에는 초기값으로 0이 세팅되어 있다.
		/*
		이 배열에 위치값이 0 인 위치에는 0 이 발생하면 1을 누적시킨다
		1인 위치에는 1이 발생하면 1을 누적시킨다.
		...
		*/
		//반복작업
		for(int i = 0 ; i < 100 ; i++) {
			//랜덤하게 숫자를 발생
			int no = (int)(Math.random()*10);
			//이렇게 위에서 발생된 숫자는 위에만든 numCount배열의 위치값으로 사용하고
			//그 위치값의 숫자를 1을 증가시켜주면 된다.
			//발생한 숫자의 카운트를 1 해줌
			numCount[no] += 1;
		}
		
		//결과를 출력
		for(int i = 0 ; i < numCount.length ; i++) {
			int no = i; //숫/자
			int count = numCount[i];//발생한 횟수
			//출력
			System.out.println(no+" : "+count);
		}
		//발생한 횟수를 특수문자를 이용하여 그래프 형태로 출력
		for(int i = 0 ; i < numCount.length ; i++) {
			int count = numCount[i];
			//숫자출력
			System.out.print(i);
			//count 횟수만큼 특수문자를 출력해야 하므로 반복문 처리
			for(int j = 0 ; j < count ; j++) {
				//출력
				System.out.print("★");
				
			}
			System.out.println();
		}
		/*
			'A' + i ='A'
			'A' + 1 ='B'
		*/
	}

}






